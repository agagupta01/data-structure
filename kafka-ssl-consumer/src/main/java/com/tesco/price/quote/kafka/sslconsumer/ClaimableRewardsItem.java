package com.tesco.price.quote.kafka.sslconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClaimableRewardsItem{

	@JsonProperty("qualifyingSpend")
	private String qualifyingSpend;

	@JsonProperty("reason")
	private String reason;

	@JsonProperty("pointsApportionment")
	private List<PointsApportionmentItem> pointsApportionment;

	@JsonProperty("scheme")
	private String scheme;

	@JsonProperty("type")
	private String type;

	@JsonProperty("promotionId")
	private String promotionId;

	@JsonProperty("points")
	private String points;

	public void setQualifyingSpend(String qualifyingSpend){
		this.qualifyingSpend = qualifyingSpend;
	}

	public String getQualifyingSpend(){
		return qualifyingSpend;
	}

	public void setReason(String reason){
		this.reason = reason;
	}

	public String getReason(){
		return reason;
	}

	public void setPointsApportionment(List<PointsApportionmentItem> pointsApportionment){
		this.pointsApportionment = pointsApportionment;
	}

	public List<PointsApportionmentItem> getPointsApportionment(){
		return pointsApportionment;
	}

	public void setScheme(String scheme){
		this.scheme = scheme;
	}

	public String getScheme(){
		return scheme;
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

	public void setPoints(String points){
		this.points = points;
	}

	public String getPoints(){
		return points;
	}

	@Override
 	public String toString(){
		return 
			"ClaimableRewardsItem{" + 
			"qualifyingSpend = '" + qualifyingSpend + '\'' + 
			",reason = '" + reason + '\'' + 
			",pointsApportionment = '" + pointsApportionment + '\'' + 
			",scheme = '" + scheme + '\'' + 
			",type = '" + type + '\'' + 
			",promotionId = '" + promotionId + '\'' + 
			",points = '" + points + '\'' + 
			"}";
		}
}