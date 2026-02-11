package com.example.alumnoapi.model;

public class EscuelaModel {
	
	private String color;
	private String nombre;
	
	public EscuelaModel() {
	}
	
	
	public EscuelaModel(String color, String nombre) {
		this.color = color;
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	


}
