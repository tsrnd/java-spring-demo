package com.tsrnd.javax.suho.training.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Post {
	@Id
	@GeneratedValue
	private Long id;
	@NotNull
	private String title;
	
	@NotNull
	private String content;
	
	@ManyToOne
	@NotNull
	private User user;
	
	@ManyToMany
	private Set<Category> categories = new HashSet<>();
	
	public Post() {
		super();
	}

	public Post(Long id, @NotNull String title, @NotNull String content, @NotNull User user, Set<Category> categories) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.user = user;
		this.categories = categories;
	}
	
	public Post(@NotNull String title, @NotNull String content, @NotNull User user, Set<Category> categories) {
		super();
		this.title = title;
		this.content = content;
		this.user = user;
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

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
}
