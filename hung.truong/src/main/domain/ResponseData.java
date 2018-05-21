package main.domain;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseData {

	private boolean success;
	private Object data;
	@JsonIgnore
	private HttpStatus status;
	private String message;

	public ResponseData(boolean success, Object data, HttpStatus status, String message) {
		super();
		this.success = success;
		this.data = data;
		this.status = status;
		this.message = message;
	}

	public static Builder builder() {
		return new Builder();
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static class Builder {
		private boolean success = true;
		private Object data;
		private HttpStatus status = HttpStatus.OK;
		private String message = null;

		public Builder success(boolean success) {
			this.success = success;
			return this;
		}

		public Builder data(Object data) {
			this.data = data;
			return this;
		}

		public Builder status(HttpStatus status) {
			this.status = status;
			return this;
		}

		public Builder message(String message) {
			this.message = message;
			return this;
		}

		public ResponseData build() {
			return new ResponseData(success, data, status, message);
		}
	}
}
