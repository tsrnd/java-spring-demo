package com.thinhung.restful.common;

import org.springframework.http.HttpStatus;

public class Meta {
	public HttpStatus statusCode;
	public String message;

	public Meta(HttpStatus statusCode, String message) {
		super();
		this.statusCode = statusCode;
		this.message = message;
	}
}
