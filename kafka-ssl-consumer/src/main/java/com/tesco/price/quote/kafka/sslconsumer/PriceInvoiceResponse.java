package com.tesco.price.quote.kafka.sslconsumer;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceInvoiceResponse{

	@JsonProperty("salesTaxTotals")
	private SalesTaxTotals salesTaxTotals;

	@JsonProperty("salesTaxes")
	private List<SalesTaxesItem> salesTaxes;

	@JsonProperty("effectivePricingDate")
	private String effectivePricingDate;

	@JsonProperty("totals")
	private Totals totals;

	@JsonProperty("store")
	private String store;

	@JsonProperty("quoteId")
	private String quoteId;

	@JsonProperty("products")
	private List<ProductsItem> products;

	@JsonProperty("quoteCreationDate")
	private String quoteCreationDate;

	@JsonProperty("paidDate")
	private String paidDate;

	@JsonProperty("isTest")
	private boolean isTest;

	@JsonProperty("locationId")
	private String locationId;

	@JsonProperty("customerId")
	private String customerId;

	@JsonProperty("orderReference")
	private String orderReference;

	@JsonProperty("returns")
	private List<Object> returns;

	@JsonProperty("invoiceId")
	private String invoiceId;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("state")
	private String state;

	@JsonProperty("event")
	private Event event;

	@JsonProperty("rewards")
	private List<RewardsItem> rewards;

	@JsonProperty("claimableRewards")
	private List<ClaimableRewardsItem> claimableRewards;

	public void setSalesTaxTotals(SalesTaxTotals salesTaxTotals){
		this.salesTaxTotals = salesTaxTotals;
	}

	public SalesTaxTotals getSalesTaxTotals(){
		return salesTaxTotals;
	}

	public void setSalesTaxes(List<SalesTaxesItem> salesTaxes){
		this.salesTaxes = salesTaxes;
	}

	public List<SalesTaxesItem> getSalesTaxes(){
		return salesTaxes;
	}

	public void setEffectivePricingDate(String effectivePricingDate){
		this.effectivePricingDate = effectivePricingDate;
	}

	public String getEffectivePricingDate(){
		return effectivePricingDate;
	}

	public void setTotals(Totals totals){
		this.totals = totals;
	}

	public Totals getTotals(){
		return totals;
	}

	public void setStore(String store){
		this.store = store;
	}

	public String getStore(){
		return store;
	}

	public void setQuoteId(String quoteId){
		this.quoteId = quoteId;
	}

	public String getQuoteId(){
		return quoteId;
	}

	public void setProducts(List<ProductsItem> products){
		this.products = products;
	}

	public List<ProductsItem> getProducts(){
		return products;
	}

	public void setQuoteCreationDate(String quoteCreationDate){
		this.quoteCreationDate = quoteCreationDate;
	}

	public String getQuoteCreationDate(){
		return quoteCreationDate;
	}

	public void setPaidDate(String paidDate){
		this.paidDate = paidDate;
	}

	public String getPaidDate(){
		return paidDate;
	}

	public void setIsTest(boolean isTest){
		this.isTest = isTest;
	}

	public boolean isIsTest(){
		return isTest;
	}

	public void setLocationId(String locationId){
		this.locationId = locationId;
	}

	public String getLocationId(){
		return locationId;
	}

	public void setCustomerId(String customerId){
		this.customerId = customerId;
	}

	public String getCustomerId(){
		return customerId;
	}

	public void setOrderReference(String orderReference){
		this.orderReference = orderReference;
	}

	public String getOrderReference(){
		return orderReference;
	}

	public void setReturns(List<Object> returns){
		this.returns = returns;
	}

	public List<Object> getReturns(){
		return returns;
	}

	public void setInvoiceId(String invoiceId){
		this.invoiceId = invoiceId;
	}

	public String getInvoiceId(){
		return invoiceId;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setEvent(Event event){
		this.event = event;
	}

	public Event getEvent(){
		return event;
	}

	public void setRewards(List<RewardsItem> rewards){
		this.rewards = rewards;
	}

	public List<RewardsItem> getRewards(){
		return rewards;
	}

	public void setClaimableRewards(List<ClaimableRewardsItem> claimableRewards){
		this.claimableRewards = claimableRewards;
	}

	public List<ClaimableRewardsItem> getClaimableRewards(){
		return claimableRewards;
	}

	@Override
 	public String toString(){
		return 
			"PriceInvoiceResponse{" + 
			"salesTaxTotals = '" + salesTaxTotals + '\'' + 
			",salesTaxes = '" + salesTaxes + '\'' + 
			",effectivePricingDate = '" + effectivePricingDate + '\'' + 
			",totals = '" + totals + '\'' + 
			",store = '" + store + '\'' + 
			",quoteId = '" + quoteId + '\'' + 
			",products = '" + products + '\'' + 
			",quoteCreationDate = '" + quoteCreationDate + '\'' + 
			",paidDate = '" + paidDate + '\'' + 
			",isTest = '" + isTest + '\'' + 
			",locationId = '" + locationId + '\'' + 
			",customerId = '" + customerId + '\'' + 
			",orderReference = '" + orderReference + '\'' + 
			",returns = '" + returns + '\'' + 
			",invoiceId = '" + invoiceId + '\'' + 
			",currency = '" + currency + '\'' + 
			",state = '" + state + '\'' + 
			",event = '" + event + '\'' + 
			",rewards = '" + rewards + '\'' + 
			",claimableRewards = '" + claimableRewards + '\'' + 
			"}";
		}
}