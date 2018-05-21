package com.tsrnd.javax.suho.training.domain.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Category {
    private Long id;
    private String title;
    @JsonProperty("posts")
    private List<Post> posts;

    public Category() {
        super();
    }

    public Category(Long id, String title) {
        super();
        this.id = id;
        this.title = title;
    }

    public Category(Long id, String title, List<Post> posts) {
        super();
        this.id = id;
        this.title = title;
        this.posts = posts;
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

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
