package main.dataaccess.provider;

import java.util.List;

import main.domain.entity.Tweet;

public interface TweetQueryProvider {
	
	public List<Tweet> getTweets();

	public List<Tweet> getUserTweets(long userId);
}
