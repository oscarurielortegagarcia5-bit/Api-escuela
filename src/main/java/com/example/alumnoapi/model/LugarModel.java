package com.example.alumnoapi.model;

public class LugarModel {
	private String estado;
	private String hora;
	
	public LugarModel() {
		
	}

	public LugarModel(String estado, String hora) {
		this.estado = estado;
		this.hora = hora;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
}
