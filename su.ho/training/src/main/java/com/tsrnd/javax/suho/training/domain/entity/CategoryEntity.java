package com.tsrnd.javax.suho.training.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class CategoryEntity {
	@Id
	@GeneratedValue
	private Long id;
	@NotNull
	private String title;
	
	public CategoryEntity() {
		super();
	}
	
	public CategoryEntity(Long id, @NotNull String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	public CategoryEntity(@NotNull String title) {
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
