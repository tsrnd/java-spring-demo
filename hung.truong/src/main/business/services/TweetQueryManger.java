package main.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import main.dataaccess.provider.TweetQueryProvider;
import main.dataaccess.provider.UserQueryProvider;
import main.domain.ResponseData;
import main.domain.entity.Tweet;

@Component
public class TweetQueryManger {

	@Autowired
	private TweetQueryProvider queryProvider;
	
	@Autowired
	private UserQueryProvider userQueryProvider;

	public List<Tweet> getTweets() {
		return queryProvider.getTweets();
	}

	public ResponseData getUserTweets(long userId) {
		ResponseData.Builder builder = ResponseData.builder();
		if (userQueryProvider.getUserById(userId) == null) {
			builder.status(HttpStatus.BAD_REQUEST);
		}
		builder.status(HttpStatus.OK).data(queryProvider.getUserTweets(userId));
		return builder.build();
	}
}
