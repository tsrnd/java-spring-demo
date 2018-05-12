package com.thinhung.restful;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Response<T> {
	public Meta meta;
	public T data;

	public Response(Meta meta, T data) {
		super();
		this.meta = meta;
		this.data = data;
	}
}
