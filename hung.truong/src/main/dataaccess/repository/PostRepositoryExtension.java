package main.dataaccess.repository;

import java.util.List;

import main.domain.entity.Post;

public interface PostRepositoryExtension {
	
	public List<Post> getUserPosts(long userId);
}
