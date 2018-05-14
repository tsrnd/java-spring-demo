package com.tsrnd.javax.suho.training.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Category {
	@Id
	@GeneratedValue
	private Long id;
	@NotNull
	private String title;
	
	public Category() {
		super();
	}
	
	public Category(Long id, @NotNull String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	public Category(@NotNull String title) {
		super();
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
