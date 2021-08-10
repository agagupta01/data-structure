package com.tesco.price.quote.kafka.sslconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscountApportionmentItem{

	@JsonProperty("lineItemId")
	private String lineItemId;

	@JsonProperty("apportionedDiscount")
	private String apportionedDiscount;

	public void setLineItemId(String lineItemId){
		this.lineItemId = lineItemId;
	}

	public String getLineItemId(){
		return lineItemId;
	}

	public void setApportionedDiscount(String apportionedDiscount){
		this.apportionedDiscount = apportionedDiscount;
	}

	public String getApportionedDiscount(){
		return apportionedDiscount;
	}

	@Override
 	public String toString(){
		return 
			"DiscountApportionmentItem{" + 
			"lineItemId = '" + lineItemId + '\'' + 
			",apportionedDiscount = '" + apportionedDiscount + '\'' + 
			"}";
		}
}