package main.dataaccess.provider;

import main.domain.ExecutionResult;
import main.domain.entity.Post;

public interface PostCommandProvider {
	
	public ExecutionResult insertPost(Post body);
}
