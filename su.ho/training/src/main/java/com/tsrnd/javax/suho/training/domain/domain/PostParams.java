package com.tsrnd.javax.suho.training.domain.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tsrnd.javax.suho.training.domain.entity.PostCategoryEntity;
import com.tsrnd.javax.suho.training.domain.entity.PostEntity;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PostParams {
    private Long id;
    private String content;
    private String title;
    @JsonProperty("user_id")
    private Long userId;
    @JsonProperty("categories")
    private List<Long> categoryIds;
    
    public PostParams() {
        super();
    }

    public PostParams(Long id, String content, String title, Long userId, List<Long> categoryIds) {
        super();
        this.id = id;
        this.content = content;
        this.title = title;
        this.userId = userId;
        this.categoryIds = categoryIds;
    }
    
    public PostEntity toEntity() {
        PostEntity entity = new PostEntity();
        entity.setTitle(title);
        entity.setContent(content);
        entity.setUserId(userId);
        return entity;
    }
    
    public List<PostCategoryEntity> toPostCategoryEnities() {
        List<PostCategoryEntity> entities = new ArrayList<>();
        for (Long categoryId: categoryIds) {
            PostCategoryEntity entity = new PostCategoryEntity();
            entity.setCategoryId(categoryId);
            entity.setPostId(id);
            entities.add(entity);
        }
        return entities;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Long> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<Long> categoryIds) {
        this.categoryIds = categoryIds;
    }
}
