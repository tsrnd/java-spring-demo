package com.tsrnd.javax.suho.training.dataaccess.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.repository.PostCategoryCommandRepository;
import com.tsrnd.javax.suho.training.dataaccess.repository.PostCommandRepository;
import com.tsrnd.javax.suho.training.domain.domain.Post;
import com.tsrnd.javax.suho.training.domain.domain.PostParams;
import com.tsrnd.javax.suho.training.domain.entity.PostCategoryEntity;
import com.tsrnd.javax.suho.training.domain.entity.PostEntity;

@Component
public class PostCommandProviderImpl implements PostCommandProvider {

    @Autowired
    private PostCommandRepository repository;

    @Autowired
    private PostCategoryCommandRepository postCategoryRepository;

    @Override
    public Post insert(PostParams params) {
        PostEntity entity = params.toEntity();
        PostEntity entitySaved = repository.save(entity);
        params.setId(entitySaved.getId());
        for (PostCategoryEntity postCategory : params.toPostCategoryEnities()) {
            postCategoryRepository.save(postCategory);
        }
        return entitySaved.toDomain();
    }

    @Override
    public Post update(PostParams params) {
        return insert(params);
    }

    @Override
    public void delete(Long id) {
        PostEntity entity = repository.findById(id).get();
        repository.delete(entity);
    }
}
