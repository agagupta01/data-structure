package com.lambda.expressions;

import java.util.Arrays;
import java.util.stream.Stream;

public class DifferntwaystoCreatetheStreamObject {

	public static void main(String[] args) {
		
		//1. Create stream object with collection object.
		
		 //2. Create a stream from specified values 
        Stream<Integer> stream 
            = Stream.of(1, 2, 
                        3, 4, 
                        5, 6, 
                        7, 8, 
                        9); 
  
        // Displaying the sequential ordered stream 
        //stream.forEach(p -> System.out.print(p + " ")); 
        
        stream.forEach(System.out::print);
        
        
        //3. Arrays.stream()
        String[] arr  = new String[] { "a", "b", "c" }; 
        
        Stream<String> streamOfArray = Arrays.stream(arr);
        
        //Stream<String> streamOfArray = Stream.of(arr); 
        
        streamOfArray.forEach(System.out::println);
        
        //4.Create an empty stream using Stream.empty()
        
        //// Create stream using Stream builder() 
        Stream.Builder<String> builder 
        = Stream.builder(); 

	    //5 Adding elements in the stream of Strings 
	    Stream<String> stream1 = builder.add("a") 
	                                .add("b") 
	                                .add("c") 
	                                .build(); 
	    
	    stream1.forEach(System.out::println);

        
	}
}
