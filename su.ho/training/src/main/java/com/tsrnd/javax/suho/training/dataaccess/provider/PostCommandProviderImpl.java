package com.tsrnd.javax.suho.training.dataaccess.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsrnd.javax.suho.training.dataaccess.repository.PostCommandRepository;

@Component
public class PostCommandProviderImpl implements PostCommandProvider {

	@Autowired
	PostCommandRepository postCommandRepository;
}
