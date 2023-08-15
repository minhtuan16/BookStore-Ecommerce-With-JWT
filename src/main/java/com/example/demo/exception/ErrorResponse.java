package com.example.demo.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
@NoArgsConstructor

public class ErrorResponse {
    private HttpStatus status;
    private String message;
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
	public ErrorResponse(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
    
    
}
