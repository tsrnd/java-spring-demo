package com.tsrnd.javax.suho.training.domain.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Post {
	private Long id;
    private String title;
    private String content;
    @JsonProperty("author")
    private User user;
    @JsonProperty("comments")
    private List<Comment> comments = new ArrayList<>();
    @JsonProperty("categories")
    private List<Category> categories = new ArrayList<>();
    
    public Post() {
    	super();
    }

	public Post(Long id, String title, String content, User user, List<Comment> comments, List<Category> categories) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.user = user;
		this.comments = comments;
		this.categories = categories;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
}
