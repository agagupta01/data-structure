package com.geeks.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class binarySearch {
 
	public static void main(String[] args) {
		List<Integer> price = Arrays.asList(5, 1, 3, 4, 6, 2);
		
		List<Integer> nodiscount = new ArrayList<>();
		
		int discountprice = 0;
		
	    for(int i = 0 ;i < price.size(); i++){
	    	boolean gotdiscountprice = false;
	        int a = price.get(i);
	        for(int j = i + 1 ; j < price.size();j++ ) {
	        	if(a >=price.get(j)) {
	        		discountprice = discountprice + (a - price.get(j));
	        		gotdiscountprice = true;
	        		break;
	        	} 
	        }
	        
	        if(!gotdiscountprice) {
	        	discountprice = discountprice + a;
	        	nodiscount.add(i);
	        }
	    }
	    
	    System.out.println(discountprice);
	    for(int i =0;i < nodiscount.size();i++)
	    	System.out.print(nodiscount.get(i) + " ");
	}
	
}

