package com.tsrnd.javax.suho.training.dataaccess.provider;

import java.util.List;

import com.tsrnd.javax.suho.training.domain.entity.UserEntity;

public interface UserQueryProvider {
    public List<UserEntity> findAll();

    public UserEntity findById(Long id);

    public UserEntity findByUsername(String username);

    public UserEntity findByUsernameAndPassword(String username, String password);
}
