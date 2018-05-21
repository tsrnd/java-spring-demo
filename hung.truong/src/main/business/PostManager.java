package main.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.business.services.PostCommandManager;
import main.business.services.PostQueryManager;
import main.domain.ExecutionResult;
import main.domain.ResponseData;
import main.domain.entity.Post;

@Component
public class PostManager {

	@Autowired
	private PostQueryManager queryManager;
	
	@Autowired
	private PostCommandManager commandManager;
	
	public ResponseData getUserPosts(long userId) {
		return queryManager.getUserPosts(userId);
	}

	public ExecutionResult insertPost(Post body) {
		return commandManager.insertPost(body);
	}
}
