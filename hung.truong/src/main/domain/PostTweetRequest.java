package main.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostTweetRequest {

	@JsonProperty(value = "user_id")
	private Long userId;

	private String content;

	public PostTweetRequest() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
