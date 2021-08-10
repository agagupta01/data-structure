package com.tesco.price.quote.kafka.sslconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class RewardsItem{

	@JsonProperty("reason")
	private String reason;

	@JsonProperty("priceOverride")
	private PriceOverride priceOverride;

	@JsonProperty("discountAmount")
	private String discountAmount;

	@JsonProperty("discountApportionment")
	private List<DiscountApportionmentItem> discountApportionment;

	@JsonProperty("type")
	private String type;

	@JsonProperty("promotionId")
	private String promotionId;

	public void setReason(String reason){
		this.reason = reason;
	}

	public String getReason(){
		return reason;
	}

	public void setPriceOverride(PriceOverride priceOverride){
		this.priceOverride = priceOverride;
	}

	public PriceOverride getPriceOverride(){
		return priceOverride;
	}

	public void setDiscountAmount(String discountAmount){
		this.discountAmount = discountAmount;
	}

	public String getDiscountAmount(){
		return discountAmount;
	}

	public void setDiscountApportionment(List<DiscountApportionmentItem> discountApportionment){
		this.discountApportionment = discountApportionment;
	}

	public List<DiscountApportionmentItem> getDiscountApportionment(){
		return discountApportionment;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setPromotionId(String promotionId){
		this.promotionId = promotionId;
	}

	public String getPromotionId(){
		return promotionId;
	}

	@Override
 	public String toString(){
		return 
			"RewardsItem{" + 
			"reason = '" + reason + '\'' + 
			",priceOverride = '" + priceOverride + '\'' + 
			",discountAmount = '" + discountAmount + '\'' + 
			",discountApportionment = '" + discountApportionment + '\'' + 
			",type = '" + type + '\'' + 
			",promotionId = '" + promotionId + '\'' + 
			"}";
		}
}