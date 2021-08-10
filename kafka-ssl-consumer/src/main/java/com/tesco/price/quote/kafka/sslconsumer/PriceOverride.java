package com.tesco.price.quote.kafka.sslconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceOverride{

	@JsonProperty("justification")
	private String justification;

	public void setJustification(String justification){
		this.justification = justification;
	}

	public String getJustification(){
		return justification;
	}

	@Override
 	public String toString(){
		return 
			"PriceOverride{" + 
			"justification = '" + justification + '\'' + 
			"}";
		}
}