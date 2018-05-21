package vn.dl.dataaccess.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.dataaccess.repository.UserCommandRepository;

import vn.dl.domain.ExecutionResult;
import vn.dl.domain.entity.UserEntity;

@Component
public class UserCommandProviderImpl implements UserCommandProvider {
	private static final Logger logger = LoggerFactory.getLogger(UserCommandProviderImpl.class);
	@Autowired
	private UserCommandRepository userCommandRepository;

	@Override
	public ExecutionResult insert(UserEntity entity) {
		ExecutionResult result = new ExecutionResult();
		try {
			userCommandRepository.save(entity);
		} catch (Exception e) {
			logger.error(e.getMessage());
			result.setError(e);
			throw e;
		}
		return result;
	}

	@Override
	public ExecutionResult update(UserEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExecutionResult delete(UserEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity getById(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
