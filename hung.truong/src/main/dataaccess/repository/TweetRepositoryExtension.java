package main.dataaccess.repository;

import java.util.List;

import main.domain.entity.Tweet;

public interface TweetRepositoryExtension {

	public List<Tweet> findByUserId(Long userId);
}
