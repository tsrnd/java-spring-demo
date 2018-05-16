package main.dataaccess.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.dataaccess.repository.TweetRepository;
import main.domain.entity.Tweet;

@Component
public class TweetQueryProviderImpl implements TweetQueryProvider {

	@Autowired
	private TweetRepository repository;

	@Override
	public List<Tweet> getTweets() {
		return repository.findAll();
	}

	@Override
	public List<Tweet> getUserTweets(long userId) {
		return repository.findByUserId(userId);
	}
}
