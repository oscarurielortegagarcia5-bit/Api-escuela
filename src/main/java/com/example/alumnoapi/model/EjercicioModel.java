package com.example.alumnoapi.model;

public class EjercicioModel {
	private InstitutoModel instituto;
	private AniversarioModel aniversario;
	private String observaciones;
	
	public EjercicioModel() {
		
	}

	public EjercicioModel(InstitutoModel instituto, AniversarioModel aniversario, String observaciones) {
		this.instituto = instituto;
		this.aniversario = aniversario;
		this.observaciones = observaciones;
	}

	public InstitutoModel getInstituto() {
		return instituto;
	}

	public void setInstituto(InstitutoModel instituto) {
		this.instituto = instituto;
	}

	public AniversarioModel getAniversario() {
		return aniversario;
	}

	public void setAniversario(AniversarioModel aniversario) {
		this.aniversario = aniversario;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	

}
