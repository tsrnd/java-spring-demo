package main.dataaccess.provider;

import java.util.List;

import main.domain.entity.Post;

public interface PostQueryProvider {
	
	public List<Post> getUserPost(long userId);
}
