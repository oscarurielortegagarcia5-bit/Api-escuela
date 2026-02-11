package com.example.alumnoapi.dto;

public class ApiResponse {
	
    private boolean success;
    private int code;
    private String message;
    
	public ApiResponse() {
	}
    
	public ApiResponse(boolean success, int code, String message) {
		this.success = success;
		this.code = code;
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
    
    
    

}
