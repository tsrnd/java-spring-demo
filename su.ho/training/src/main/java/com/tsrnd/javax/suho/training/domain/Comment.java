package com.tsrnd.javax.suho.training.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Comment {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	@NotNull
	private User user;
	@ManyToOne
	@NotNull
	private Post post;
	@NotNull
	private String content;
	@NotNull
	private Date createdAt;
	
	public Comment() {
		super();
	}

	public Comment(Long id, @NotNull User user, @NotNull String content, @NotNull Date createdAt) {
		super();
		this.id = id;
		this.user = user;
		this.content = content;
		this.createdAt = createdAt;
	}
	
	public Comment(@NotNull User user, @NotNull String content) {
		super();
		this.user = user;
		this.content = content;
		this.createdAt = new Date();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
