package com.thinhung.restful.model.domain;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Invoice {
	@JsonProperty(value = "id")
	private Long id;
	@JsonProperty(value = "sell_date")
	private Date sellDate;
	@JsonProperty(value = "customer_id")
	private Long customerId;
	@JsonProperty(value = "employee_id")
	private Long employeeId;
	@JsonProperty(value = "total_amount")
	private Long totalAmount;
	@JsonProperty(value = "goods_id")
	private Long quantity;
	@JsonProperty(value = "price")
	private Long price;
	@JsonProperty(value = "sale_off")
	private Long saleOff;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getSellDate() {
		return sellDate;
	}
	public void setSellDate(Date sellDate) {
		this.sellDate = sellDate;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public Long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Long getSaleOff() {
		return saleOff;
	}
	public void setSaleOff(Long saleOff) {
		this.saleOff = saleOff;
	}

	public Invoice() {
		super();
	}
	
	public Invoice(Long id, Long totalAmount) {
		super();
		this.id = id;
		this.totalAmount = totalAmount;
	}
	void toEntity() {
		
	}
}
