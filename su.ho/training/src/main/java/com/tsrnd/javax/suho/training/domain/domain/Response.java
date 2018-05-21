package com.tsrnd.javax.suho.training.domain.domain;

import java.util.Date;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = { "httpStatus" })
public class Response {
    private Object data;
    private Date timestamp;
    private int status;
    private HttpStatus httpStatus;
    private Object error;
    private String message;
    private String path;

    public Response() {
        this.httpStatus = HttpStatus.OK;
        this.status = HttpStatus.OK.value();
    }

    public Response(Object data) {
        this.data = data;
    }

    public Response(HttpStatus httpStatus, String path) {
        this.timestamp = new Date();
        this.status = httpStatus.value();
        this.httpStatus = httpStatus;
        this.error = httpStatus.name();
        this.message = httpStatus.getReasonPhrase();
        this.path = path;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
