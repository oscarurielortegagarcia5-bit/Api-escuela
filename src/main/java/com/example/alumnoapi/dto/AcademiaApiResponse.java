package com.example.alumnoapi.dto;

public class AcademiaApiResponse<T> {
	private String mensaje;
	private T data;
	
	public AcademiaApiResponse(String mensaje, T data) {
		this.mensaje = mensaje;
		this.data =data;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public T getData() {
		return data;
	}
}
