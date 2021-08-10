package com.tesco.price.quote.kafka.sslconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductsItem{

	@JsonProperty("gtin")
	private String gtin;

	@JsonProperty("lineItemId")
	private String lineItemId;

	@JsonProperty("priceBeforeDiscounts")
	private String priceBeforeDiscounts;

	@JsonProperty("priceAfterDiscounts")
	private String priceAfterDiscounts;

	public void setGtin(String gtin){
		this.gtin = gtin;
	}

	public String getGtin(){
		return gtin;
	}

	public void setLineItemId(String lineItemId){
		this.lineItemId = lineItemId;
	}

	public String getLineItemId(){
		return lineItemId;
	}

	public void setPriceBeforeDiscounts(String priceBeforeDiscounts){
		this.priceBeforeDiscounts = priceBeforeDiscounts;
	}

	public String getPriceBeforeDiscounts(){
		return priceBeforeDiscounts;
	}

	public void setPriceAfterDiscounts(String priceAfterDiscounts){
		this.priceAfterDiscounts = priceAfterDiscounts;
	}

	public String getPriceAfterDiscounts(){
		return priceAfterDiscounts;
	}

	@Override
 	public String toString(){
		return 
			"ProductsItem{" + 
			"gtin = '" + gtin + '\'' + 
			",lineItemId = '" + lineItemId + '\'' + 
			",priceBeforeDiscounts = '" + priceBeforeDiscounts + '\'' + 
			",priceAfterDiscounts = '" + priceAfterDiscounts + '\'' + 
			"}";
		}
}