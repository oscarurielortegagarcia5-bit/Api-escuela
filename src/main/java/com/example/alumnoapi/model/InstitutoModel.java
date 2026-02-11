package com.example.alumnoapi.model;

public class InstitutoModel {
	private EscuelahModel escuela;
	
	public InstitutoModel() {
		
	}
	public InstitutoModel(EscuelahModel escuela) {
		this.escuela = escuela;
	}

	public EscuelahModel getEscuela() {
		return escuela;
	}

	public void setEscuela(EscuelahModel escuela) {
		this.escuela = escuela;
	}
	
	
}
