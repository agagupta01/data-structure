package com.tesco.price.quote.kafka.sslconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class PointsApportionmentItem{

	@JsonProperty("lineItemId")
	private String lineItemId;

	@JsonProperty("apportionedPoints")
	private String apportionedPoints;

	public void setLineItemId(String lineItemId){
		this.lineItemId = lineItemId;
	}

	public String getLineItemId(){
		return lineItemId;
	}

	public void setApportionedPoints(String apportionedPoints){
		this.apportionedPoints = apportionedPoints;
	}

	public String getApportionedPoints(){
		return apportionedPoints;
	}

	@Override
 	public String toString(){
		return 
			"PointsApportionmentItem{" + 
			"lineItemId = '" + lineItemId + '\'' + 
			",apportionedPoints = '" + apportionedPoints + '\'' + 
			"}";
		}
}