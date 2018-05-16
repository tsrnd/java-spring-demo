package main.controller;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.business.TweetManager;
import main.controller.validators.PostTweetValidator;
import main.domain.ExecutionResult;
import main.domain.PostTweetRequest;
import main.domain.ResponseData;

@RestController
@RequestMapping("/api/v1/tweets")
public class TweetController {

	@Autowired
	private TweetManager tweetManager;

	@Autowired
	private PostTweetValidator postTweetValidator;

	@GetMapping
	public ResponseEntity<ResponseData> getTweets() {
		try {
			return ResponseEntity.ok(ResponseData.builder().data(tweetManager.getTweets()).build());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ResponseData> postTweet(@RequestBody PostTweetRequest request, Errors errors) {
		postTweetValidator.validate(request, errors);
		ResponseData.Builder builder = ResponseData.builder();
		if (errors.hasErrors()) {
			return ResponseEntity.badRequest().body(builder.success(false).data(String.join(",",
					errors.getAllErrors().stream().map(it -> it.getDefaultMessage()).collect(Collectors.toList())))
					.build());
		}
		try {
			ExecutionResult result = tweetManager.postTweet(request);
			builder.status((HttpStatus) result.getData());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		ResponseData data = builder.build();
		return ResponseEntity.status(data.getStatus()).body(data);
	}

	@GetMapping("/{user_id}")
	public ResponseEntity<ResponseData> getUserTweets(@PathVariable("user_id") long userId) {
		ResponseData data = tweetManager.getUserTweets(userId);
		return ResponseEntity.status(data.getStatus()).body(data);
	}
}
