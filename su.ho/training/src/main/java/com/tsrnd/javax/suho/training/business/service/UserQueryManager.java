package com.tsrnd.javax.suho.training.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.provider.UserQueryProvider;
import com.tsrnd.javax.suho.training.domain.entity.UserEntity;

@Component
public class UserQueryManager {
    @Autowired
    private UserQueryProvider userQueryProvider;

    public List<UserEntity> findAll() {
        return userQueryProvider.findAll();
    }

    public UserEntity findById(Long id) {
        return userQueryProvider.findById(id);
    }

    public UserEntity findByUsername(String username) {
        return userQueryProvider.findByUsername(username);
    }

    public UserEntity findByUsernameAndPassword(String username, String password) {
        return userQueryProvider.findByUsernameAndPassword(username, password);
    }
}
