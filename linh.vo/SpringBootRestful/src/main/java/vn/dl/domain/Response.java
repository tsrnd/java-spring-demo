package vn.dl.domain;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = { "httpStatus" })
public class Response {
	private int status;
	private HttpStatus httpStatus;
	private Object data;
	private String error;
	private String message;
	
	public Response() {
		this.httpStatus = HttpStatus.OK;
		this.status = HttpStatus.OK.value();
	}
	
	public Response(Object data) {
		this.data = data;
	}
	
	public Response(int status, HttpStatus httpStatus, Object data, String error, String message) {
		super();
		this.status = status;
		this.httpStatus = httpStatus;
		this.data = data;
		this.error = error;
		this.message = message;
	}

	// Getters and Setters
	
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
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
