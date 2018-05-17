package main.dataaccess.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.dataaccess.repository.PostRepository;
import main.domain.entity.Post;

@Component
public class PostQueryProviderImpl implements PostQueryProvider{
	
	@Autowired
	private PostRepository repository;

	@Override
	public List<Post> getUserPost(long userId) {
		return repository.getUserPosts(userId);
	}
}
