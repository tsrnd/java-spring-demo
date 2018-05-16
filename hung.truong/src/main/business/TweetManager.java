package main.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.business.services.TweetCommandManager;
import main.business.services.TweetQueryManger;
import main.domain.ExecutionResult;
import main.domain.PostTweetRequest;
import main.domain.ResponseData;
import main.domain.entity.Tweet;

@Component
public class TweetManager {
	
	@Autowired
	private TweetQueryManger queryManager;
	
	@Autowired
	private TweetCommandManager commandManager;
	
	public List<Tweet> getTweets() {
		return queryManager.getTweets();
	}

	public ExecutionResult postTweet(PostTweetRequest request) {
		return commandManager.postTweet(request);
	}

	public ResponseData getUserTweets(long userId) {
		return queryManager.getUserTweets(userId);
	}
}
