package com.tsrnd.javax.suho.training.domain.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentEntity {
	@Id
	@GeneratedValue
	private Long id;
	@NotNull
	private Long userId;
	@NotNull
	private Long postId;
	@NotNull
	private String content;
	@NotNull
	private Date createdAt;
	
	public CommentEntity() {
		super();
	}

	public CommentEntity(Long id, @NotNull Long userId, @NotNull Long postId, @NotNull String content, @NotNull Date createdAt) {
		super();
		this.id = id;
		this.userId = userId;
		this.postId = postId;
		this.content = content;
		this.createdAt = createdAt;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}
	
	
}
