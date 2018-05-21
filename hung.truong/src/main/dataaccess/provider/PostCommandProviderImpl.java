package main.dataaccess.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.dataaccess.repository.PostRepository;
import main.domain.ExecutionResult;
import main.domain.ExecutionResult.Status;
import main.domain.entity.Post;

@Component
public class PostCommandProviderImpl implements PostCommandProvider {

	@Autowired
	private PostRepository repository;

	@Override
	public ExecutionResult insertPost(Post body) {
		ExecutionResult result = new ExecutionResult();
		try {
			result.setData(repository.save(body));
			result.setResult(Status.Success);
		} catch (Exception e) {
			result.setResult(Status.Failed);
			result.setData(e);
		}
		return result;
	}
}
