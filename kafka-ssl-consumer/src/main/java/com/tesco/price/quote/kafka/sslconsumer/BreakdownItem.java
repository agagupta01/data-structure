package com.tesco.price.quote.kafka.sslconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class BreakdownItem{

	@JsonProperty("taxAuthority")
	private String taxAuthority;

	@JsonProperty("total")
	private String total;

	@JsonProperty("taxCode")
	private String taxCode;

	public void setTaxAuthority(String taxAuthority){
		this.taxAuthority = taxAuthority;
	}

	public String getTaxAuthority(){
		return taxAuthority;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public String getTotal(){
		return total;
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
			"BreakdownItem{" + 
			"taxAuthority = '" + taxAuthority + '\'' + 
			",total = '" + total + '\'' + 
			",taxCode = '" + taxCode + '\'' + 
			"}";
		}
}