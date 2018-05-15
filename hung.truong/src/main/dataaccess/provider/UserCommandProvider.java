package main.dataaccess.provider;

import main.domain.ExecutionResult;
import main.domain.User;

public interface UserCommandProvider {

	public ExecutionResult addUser(User user);

	public ExecutionResult editUser(User user);

	public ExecutionResult deleteUser(long userId);
}
