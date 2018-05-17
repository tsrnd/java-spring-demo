package com.thinhung.restful.common;

public class Data<T> extends Object {
	public T value;

	public Data() {
		super();
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
