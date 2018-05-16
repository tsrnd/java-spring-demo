package com.tsrnd.javax.suho.training.dataaccess.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.repository.UserCommandRepository;
import com.tsrnd.javax.suho.training.domain.entity.UserEntity;

@Component
public class UserCommandProviderImpl implements UserCommandProvider {

    @Autowired
    private UserCommandRepository userCommandRepository;

    @Override
    public UserEntity save(UserEntity user) {
        return userCommandRepository.save(user);
    }

    @Override
    public void delete(UserEntity user) {
        userCommandRepository.delete(user);
    }
}
