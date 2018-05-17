package com.thinhung.restful.common;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta {
	@JsonProperty(value = "status_code")
	private HttpStatus statusCode;
	
	@JsonProperty(value = "message")
	private String message;

	public HttpStatus getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Meta(HttpStatus statusCode, String message) {
		super();
		this.statusCode = statusCode;
		this.message = message;
	}
}
