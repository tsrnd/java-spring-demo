package main.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.dataaccess.provider.PostCommandProvider;
import main.domain.ExecutionResult;
import main.domain.entity.Post;

@Component
public class PostCommandManager {

	@Autowired
	private PostCommandProvider commandProvider;

	public ExecutionResult insertPost(Post body) {
		return commandProvider.insertPost(body);
	}
}
