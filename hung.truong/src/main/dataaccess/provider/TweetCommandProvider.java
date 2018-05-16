package main.dataaccess.provider;

import main.domain.PostTweetRequest;
import main.domain.entity.Tweet;

public interface TweetCommandProvider {

	public Tweet insertTweet(PostTweetRequest request);
}
