package com.tsrnd.javax.suho.training.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
	private Object data;
	private ResponseMetadata metadata;
	private ResponseError error;

	public Response() {
	}

	public Response(Object data, ResponseMetadata metadata, ResponseError error) {
		this.data = data;
		this.metadata = metadata;
		this.error = error;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ResponseMetadata getMetadata() {
		return metadata;
	}

	public void setMetadata(ResponseMetadata metadata) {
		this.metadata = metadata;
	}

	public ResponseError getError() {
		return error;
	}

	public void setError(ResponseError error) {
		this.error = error;
	}
}
