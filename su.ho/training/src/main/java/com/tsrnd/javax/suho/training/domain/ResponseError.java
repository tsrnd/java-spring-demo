package com.tsrnd.javax.suho.training.domain;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "status" })
public class ResponseError {
	private HttpStatus status;
	private int statusCode;
	private String message;

	public ResponseError(HttpStatus status) {
		this.status = status;
		this.statusCode = status.value();
		this.message = status.getReasonPhrase();
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
