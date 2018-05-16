package com.tsrnd.javax.suho.training.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class PostCategoryEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Long postId;
    private Long categoryId;
    @NotNull
    private Boolean isDelete = false;

    public PostCategoryEntity() {
        super();
        // TODO Auto-generated constructor stub
    }

    public PostCategoryEntity(Long postId, Long categoryId) {
        super();
        this.postId = postId;
        this.categoryId = categoryId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}
