package com.lambda.expressions;

import java.util.*;
import java.util.stream.Stream;

public class StreamSamples {

	public static void main(String[] args) {

		/*List<String> names = new ArrayList<>();
        
		names.add("Charlie");
		                 
		names.add("Douglas");
		                 
		names.add("Sundaraman");
		                 
		names.add("Charlie");
		                 
		names.add("Yuki");
		
		names.stream().map(String::toUpperCase).forEach(System.out::println);
		
		*/
		
		List<Integer> numbers = Arrays.asList(4, 2, 8, 9, 5, 6, 7);
        
		Stream<Integer> numbersGreaterThan5 = numbers.stream().filter(i -> i > 5);
		         
		//Traversing numbersGreaterThan5 stream first time
		         
		numbersGreaterThan5.forEach(System.out::println);
		
		/*
		//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:229)
		at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:418)
		at com.lambda.expressions.StreamSamples.main(StreamSamples.java:34)*/
		
		
		//numbersGreaterThan5.forEach(System.out::println);
	}

}
