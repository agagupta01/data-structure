package com.tesco.price.quote.kafka.sslconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SalesTaxTotals{

	@JsonProperty("total")
	private String total;

	@JsonProperty("breakdown")
	private List<BreakdownItem> breakdown;

	public void setTotal(String total){
		this.total = total;
	}

	public String getTotal(){
		return total;
	}

	public void setBreakdown(List<BreakdownItem> breakdown){
		this.breakdown = breakdown;
	}

	public List<BreakdownItem> getBreakdown(){
		return breakdown;
	}

	@Override
 	public String toString(){
		return 
			"SalesTaxTotals{" + 
			"total = '" + total + '\'' + 
			",breakdown = '" + breakdown + '\'' + 
			"}";
		}
}