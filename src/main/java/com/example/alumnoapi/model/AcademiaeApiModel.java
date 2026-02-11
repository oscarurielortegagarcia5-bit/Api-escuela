package com.example.alumnoapi.model;

public class AcademiaeApiModel{
	private EscuelaeModel escuela;
	private String observaciones;
	
	public AcademiaeApiModel() {
	}
	
	public AcademiaeApiModel(EscuelaeModel escuela, String observaciones) {
		this.escuela = escuela;
		this.observaciones = observaciones;
	}
	public EscuelaeModel getEscuela() {
		return escuela;
	}
	public void setEscuela(EscuelaeModel escuela) {
		this.escuela = escuela;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
}
