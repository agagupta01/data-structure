package com.tesco.price.quote.kafka.sslconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event{

	@JsonProperty("traceId")
	private String traceId;

	@JsonProperty("clientId")
	private String clientId;

	@JsonProperty("id")
	private String id;

	@JsonProperty("type")
	private String type;

	@JsonProperty("timestamp")
	private String timestamp;

	public void setTraceId(String traceId){
		this.traceId = traceId;
	}

	public String getTraceId(){
		return traceId;
	}

	public void setClientId(String clientId){
		this.clientId = clientId;
	}

	public String getClientId(){
		return clientId;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setTimestamp(String timestamp){
		this.timestamp = timestamp;
	}

	public String getTimestamp(){
		return timestamp;
	}

	@Override
 	public String toString(){
		return 
			"Event{" + 
			"traceId = '" + traceId + '\'' + 
			",clientId = '" + clientId + '\'' + 
			",id = '" + id + '\'' + 
			",type = '" + type + '\'' + 
			",timestamp = '" + timestamp + '\'' + 
			"}";
		}
}