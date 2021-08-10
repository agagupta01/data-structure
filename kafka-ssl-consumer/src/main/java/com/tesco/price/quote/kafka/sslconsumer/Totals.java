package com.tesco.price.quote.kafka.sslconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Totals{

	@JsonProperty("totalReturns")
	private String totalReturns;

	@JsonProperty("totalBeforeDiscounts")
	private String totalBeforeDiscounts;

	@JsonProperty("totalAfterDiscounts")
	private String totalAfterDiscounts;

	@JsonProperty("grandTotal")
	private String grandTotal;

	public void setTotalReturns(String totalReturns){
		this.totalReturns = totalReturns;
	}

	public String getTotalReturns(){
		return totalReturns;
	}

	public void setTotalBeforeDiscounts(String totalBeforeDiscounts){
		this.totalBeforeDiscounts = totalBeforeDiscounts;
	}

	public String getTotalBeforeDiscounts(){
		return totalBeforeDiscounts;
	}

	public void setTotalAfterDiscounts(String totalAfterDiscounts){
		this.totalAfterDiscounts = totalAfterDiscounts;
	}

	public String getTotalAfterDiscounts(){
		return totalAfterDiscounts;
	}

	public void setGrandTotal(String grandTotal){
		this.grandTotal = grandTotal;
	}

	public String getGrandTotal(){
		return grandTotal;
	}

	@Override
 	public String toString(){
		return 
			"Totals{" + 
			"totalReturns = '" + totalReturns + '\'' + 
			",totalBeforeDiscounts = '" + totalBeforeDiscounts + '\'' + 
			",totalAfterDiscounts = '" + totalAfterDiscounts + '\'' + 
			",grandTotal = '" + grandTotal + '\'' + 
			"}";
		}
}