package vn.dl.domain;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3206659789907029006L;
	private int status;
	private HttpStatus httpStatus;
	private Object data;
	private Object error;
	private String message;
	private Boolean success = true;

	public Response() {
	}
	
	public Response(int status, HttpStatus httpStatus, Object data, Object error, String message, Boolean success) {
		super();
		this.status = status;
		this.httpStatus = httpStatus;
		this.data = data;
		this.error = error;
		this.message = message;
		this.success = success;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Object getError() {
		return error;
	}
	public void setError(Object error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
}
