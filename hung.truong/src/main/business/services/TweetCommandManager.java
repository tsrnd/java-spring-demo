package main.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import main.dataaccess.provider.TweetCommandProvider;
import main.dataaccess.provider.UserQueryProvider;
import main.domain.ExecutionResult;
import main.domain.ExecutionResult.Status;
import main.domain.PostTweetRequest;

@Component
public class TweetCommandManager {

	@Autowired
	private TweetCommandProvider commandProvider;

	@Autowired
	private UserQueryProvider userQueryProvider;

	public ExecutionResult postTweet(PostTweetRequest request) {
		ExecutionResult result = new ExecutionResult();
		if (userQueryProvider.getUserById(request.getUserId()) == null) {
			result.setData(HttpStatus.BAD_REQUEST);
		}
		result.setResult(commandProvider.insertTweet(request) != null ? Status.Success : Status.Failed);
		result.setData(HttpStatus.OK);
		return result;
	}
}
