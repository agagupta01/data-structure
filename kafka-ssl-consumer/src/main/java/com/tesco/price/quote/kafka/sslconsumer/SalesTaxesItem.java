package com.tesco.price.quote.kafka.sslconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SalesTaxesItem{

	@JsonProperty("taxAuthority")
	private String taxAuthority;

	@JsonProperty("gtin")
	private String gtin;

	@JsonProperty("taxAmount")
	private String taxAmount;

	@JsonProperty("taxCode")
	private String taxCode;

	public void setTaxAuthority(String taxAuthority){
		this.taxAuthority = taxAuthority;
	}

	public String getTaxAuthority(){
		return taxAuthority;
	}

	public void setGtin(String gtin){
		this.gtin = gtin;
	}

	public String getGtin(){
		return gtin;
	}

	public void setTaxAmount(String taxAmount){
		this.taxAmount = taxAmount;
	}

	public String getTaxAmount(){
		return taxAmount;
	}

	public void setTaxCode(String taxCode){
		this.taxCode = taxCode;
	}

	public String getTaxCode(){
		return taxCode;
	}

	@Override
 	public String toString(){
		return 
			"SalesTaxesItem{" + 
			"taxAuthority = '" + taxAuthority + '\'' + 
			",gtin = '" + gtin + '\'' + 
			",taxAmount = '" + taxAmount + '\'' + 
			",taxCode = '" + taxCode + '\'' + 
			"}";
		}
}