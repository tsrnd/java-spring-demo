package com.thinhung.restful.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Response {
	@JsonProperty(value = "meta")
	private Meta meta;
	@JsonProperty(value = "data")
	private Object data;

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public Response(Meta meta, Object data) {
		super();
		this.meta = meta;
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
