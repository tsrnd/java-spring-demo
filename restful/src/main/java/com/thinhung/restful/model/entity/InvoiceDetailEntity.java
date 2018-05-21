package com.thinhung.restful.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.thinhung.restful.model.domain.Invoice;

@Entity
@Table(name = "invoice_detail")
public class InvoiceDetailEntity implements BaseEntityInterface<Invoice> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "total_amount")
	private Long totalAmount;
	@Column(name = "quantity")
	private Long quantity;
	@Column(name = "goods_id")
	private Long goodsId;
	@Column(name = "price")
	private Long price;
	@Column(name = "sale_off")
	private Long saleOff;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Long getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
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

	public InvoiceDetailEntity() {
		super();
	}
	
	public Invoice toDomain() {
		return new Invoice(id, totalAmount);
	}
}
