package com.thinhung.restful.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Response<T> {
	@JsonProperty(value = "meta")
	private Meta meta;
	@JsonProperty(value = "data")
	private Data<T> data;

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public Response(Meta meta, Data<T> data) {
		super();
		this.meta = meta;
		this.data = data;
	}

	public Data<T> getData() {
		return data;
	}

	public void setData(Data<T> data) {
		this.data = data;
	}
}
