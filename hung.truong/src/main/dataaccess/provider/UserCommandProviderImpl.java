package main.dataaccess.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.dataaccess.repository.UserRepository;
import main.domain.ExecutionResult;
import main.domain.entity.User;

@Component
public class UserCommandProviderImpl implements UserCommandProvider {

	@Autowired
	private UserRepository repository;

	@Override
	public ExecutionResult addUser(User user) {
		ExecutionResult result = new ExecutionResult();
		User returnEntity = null;
		try {
			returnEntity = repository.save(user);
		} catch (Exception e) {
			result.setError(e);
			result.setResult(ExecutionResult.Status.Failed);
		}
		result.setResult(ExecutionResult.Status.Success);
		result.setData(returnEntity);
		return result;
	}

	@Override
	public ExecutionResult editUser(User user) {
		ExecutionResult result = new ExecutionResult();
		User returnEntity = null;
		try {
			repository.save(user);
		} catch (Exception e) {
			result.setError(e);
			result.setResult(ExecutionResult.Status.Failed);
		}
		result.setResult(ExecutionResult.Status.Success);
		result.setData(returnEntity);
		return result;
	}

	@Override
	public ExecutionResult deleteUser(long userId) {
		ExecutionResult result = new ExecutionResult();
		try {
			repository.delete(userId);
		} catch (Exception e) {
			result.setError(e);
			result.setResult(ExecutionResult.Status.Failed);
		}
		result.setResult(ExecutionResult.Status.Success);
		return result;
	}
}
