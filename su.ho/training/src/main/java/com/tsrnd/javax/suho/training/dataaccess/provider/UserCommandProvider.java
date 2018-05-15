package com.tsrnd.javax.suho.training.dataaccess.provider;

import com.tsrnd.javax.suho.training.domain.entity.UserEntity;

public interface UserCommandProvider {
	public UserEntity save(UserEntity user);
	public void delete(UserEntity user);
}
