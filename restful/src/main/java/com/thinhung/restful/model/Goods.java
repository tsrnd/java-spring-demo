package com.thinhung.restful.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Goods")
public class Goods {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private int quantity;
	@Column(name = "income_amount")
	private int incomeAmount;
	@Column(name = "outcome_amount")
	private int outcomeAmount;
	private String image;
	private String note;
	@Column(name = "material_id")
	private Long materialId;
	
	public Goods() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getIncomeAmount() {
		return incomeAmount;
	}

	public void setIncomeAmount(int incomeAmount) {
		this.incomeAmount = incomeAmount;
	}

	public int getOutcomeAmount() {
		return outcomeAmount;
	}

	public void setOutcomeAmount(int outcomeAmount) {
		this.outcomeAmount = outcomeAmount;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Long getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}
}
