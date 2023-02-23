package com.axess.abccorebank.config;

import org.springframework.stereotype.Component;

@Component
public class ApiSuccessResponse {

	private String message;

	private Object body;

	private boolean success;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}

