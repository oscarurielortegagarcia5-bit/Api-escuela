package com.example.alumnoapi.model;

public class EscuelahModel {
	private String nombre;
	private String nivel;
	
	public EscuelahModel() {
	}
	
	public EscuelahModel(String nombre, String nivel) {
		this.nombre = nombre;
		this.nivel = nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	
	
	
}
