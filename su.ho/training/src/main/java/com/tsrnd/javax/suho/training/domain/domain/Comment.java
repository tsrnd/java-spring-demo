package com.tsrnd.javax.suho.training.domain.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Comment {
	private Long id;
	private User user;
	private Post post;
	private String content;
	@JsonProperty("created_at")
	private Date createAt;
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(Long id, User user, Post post, String content, Date createAt) {
		super();
		this.id = id;
		this.user = user;
		this.post = post;
		this.content = content;
		this.createAt = createAt;
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

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
}
