package vn.dl.domain.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExecutionResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2201941691673753718L;
	private Object data;
	private Exception error;
	private Integer errorCode;
	private String message;
	private Status result;
	
	public enum Status {
		Success, Failed, Inprofress;
	}
	
	public ExecutionResult() {
	}

	public ExecutionResult(Object data, Exception error, Integer errorCode, String message, Status result) {
		super();
		this.data = data;
		this.error = error;
		this.errorCode = errorCode;
		this.message = message;
		this.result = result;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Exception getError() {
		return error;
	}

	public void setError(Exception error) {
		this.error = error;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Status getResult() {
		return result;
	}

	public void setResult(Status result) {
		this.result = result;
	}
}
