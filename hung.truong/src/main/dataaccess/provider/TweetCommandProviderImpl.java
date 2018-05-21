package main.dataaccess.provider;

import java.sql.Time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.dataaccess.repository.TweetRepository;
import main.domain.PostTweetRequest;
import main.domain.entity.Tweet;

@Component
public class TweetCommandProviderImpl implements TweetCommandProvider{

	@Autowired
	private TweetRepository repository;
	
	@Override
	public Tweet insertTweet(PostTweetRequest request) {
		return repository.save(new Tweet(null, request.getUserId(), new Time(System.currentTimeMillis()), request.getContent(), null));
	}
}
