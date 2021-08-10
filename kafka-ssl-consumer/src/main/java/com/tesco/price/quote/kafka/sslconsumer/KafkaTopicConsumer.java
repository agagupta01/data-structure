package com.tesco.price.quote.kafka.sslconsumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.Validate;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

/***
 * KafkaTopicConsumer
 *
 * This class provides a simple executable example of consuming messages from a Kafka topic.
 * The configuration for the project provides all the properties required to connect to the
 * Quote API's Kafka cluster which has been configured to use two-way-SSL.
 *
 * The main method of this class loads the properties from a file and then consumes from the chosen topic.
 * With the provided configuration, offsets are never committed, therefore this application can be run multiple
 * times and the output will always consume all messages from the earliest offset on the topic.
 */
public class KafkaTopicConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaTopicConsumer.class);

    private static final String USAGE = "Usage:\n$ java -Dconsumer.properties=consumer.properties -jar kafka-ssl-consumer-1.0-all.jar invoices StoreStockColleague";
    private static final String CONSUMER_PROPERTIES = "consumer.properties";

    private final Consumer<String, String> consumer;
    private final String topic;

    private final AtomicBoolean closed = new AtomicBoolean(false);
    private final ObjectMapper mObjectMapper = new ObjectMapper();
    private KafkaTopicConsumer(Properties properties, String topic) {
        this.consumer = new KafkaConsumer<>(properties);
        this.topic = topic;
    }
private static int filenumber=1;
    private static    String name="\\Data\\invoices.txt";
    public static void main(String[] args) {
        Validate.validIndex(args, 0, "Must supply a topic name.%n%s", USAGE);
        Validate.validIndex(args, 1, "Must supply a group id.%n%s", USAGE);

        Properties properties = loadProperties();
        properties.setProperty("group.id", args[1]);

        // This property defaults to 'https' in Kafka client version 2+; our current Kafka cluster
        // (December 2018 in AWS, Kafka broker version 1.0.2) does not support https for SSL communication,
        // thus we need to remove the property explicitly.
        properties.setProperty("ssl.endpoint.identification.algorithm", "");

        KafkaTopicConsumer consumer = new KafkaTopicConsumer(properties, args[0]);
        new Thread(consumer::consume).start();
    }

    private void consume() {
        try {
            consumer.subscribe(Collections.singletonList(topic));
            while (!closed.get()) {
                LOGGER.info("Inside WWhile");
                ConsumerRecords<String, String> records = consumer.poll(10000);
                records.forEach(this::logMessageConsumed);
                LOGGER.info("Fetching messages started with count {}",records.count());
            }
        } catch (WakeupException e) {
            if (!closed.get()) throw e; // Ignore exception if closing
        } finally {
            consumer.close();
        }
    }

    private void logMessageConsumed(ConsumerRecord<String, String> record) {

        FileOutputStream outputStream;
        try {

            PriceInvoiceResponse priceInvoiceResponse = null;
            LOGGER.info("Record value initiated: with value {}", record.value());
            try {
                priceInvoiceResponse =  mObjectMapper.readValue(record.value(), PriceInvoiceResponse.class);
                if(priceInvoiceResponse.getStore().equalsIgnoreCase( "5363") ||
                        priceInvoiceResponse.getStore().equalsIgnoreCase( "2280") ||
                        priceInvoiceResponse.getStore().equalsIgnoreCase( "6041")||
                        priceInvoiceResponse.getStore().equalsIgnoreCase( "2001")) {
                    outputStream = new FileOutputStream(priceInvoiceResponse.getStore() + "_" + priceInvoiceResponse.getQuoteId() + ".txt", true);
                    byte[] strToBytes = record.value().getBytes();
                    outputStream.write(strToBytes);
                    outputStream.close();
                    try {
                        for (int i = 0; i < priceInvoiceResponse.getRewards().size(); i++) {
                            if (priceInvoiceResponse.getRewards().get(i).getPriceOverride().getJustification().equalsIgnoreCase("reduced_to_clear")) {
                                int lineidd = Integer.parseInt(priceInvoiceResponse.getRewards().get(i).getDiscountApportionment().get(0).getLineItemId());
                                ProductsItem product = priceInvoiceResponse.getProducts().get(lineidd - 1);
                                outputStream = new FileOutputStream(priceInvoiceResponse.getStore() + "_" + "ProductList.txt", true);
                                byte[] strToBytesa = (product.getGtin()+" ").getBytes();
                                outputStream.write(strToBytesa);
                                outputStream.close();
                            }
                        }
                    } catch (Exception e) {
                        LOGGER.error("getParsedEventData() ::: parsing exception for Products, error is : " + e.getMessage());

                    }
                }
            } catch (Exception e) {
                LOGGER.error("getParsedEventData() ::: parsing exception for Products, error is : " + e.getMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.info("Record: with value {}", record.value());
       LOGGER.info("Consumed message at offset {}, with key {}.", record.offset(), record.key());
    }

    private static Properties loadProperties() {
        String propertiesFile = System.getProperty(CONSUMER_PROPERTIES, CONSUMER_PROPERTIES);

        Properties properties = new Properties();

        try (FileInputStream fis = new FileInputStream(propertiesFile)) {
            properties.load(fis);
        } catch (IOException e) {
            LOGGER.error("Must supply a valid properties file, expected file: {}.", propertiesFile);
            e.printStackTrace();
        }

        LOGGER.info("Using properties file: {}.", propertiesFile);
        return properties;
    }
}
