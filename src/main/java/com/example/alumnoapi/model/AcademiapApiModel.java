package com.example.alumnoapi.model;

public class AcademiapApiModel {
	private AlumnoModel alumno;
    private ClasesModel clases;
    private EscuelaModel escuela;
    
    public AcademiapApiModel() {
    	
    }
	public AcademiapApiModel(AlumnoModel alumno, ClasesModel clases, EscuelaModel escuela) {
		this.alumno = alumno;
		this.clases = clases;
		this.escuela = escuela;
	}


	public AlumnoModel getAlumno() {
		return alumno;
	}


	public void setAlumno(AlumnoModel alumno) {
		this.alumno = alumno;
	}


	public ClasesModel getClases() {
		return clases;
	}


	public void setClases(ClasesModel clases) {
		this.clases = clases;
	}


	public EscuelaModel getEscuela() {
		return escuela;
	}


	public void setEscuela(EscuelaModel escuela) {
		this.escuela = escuela;
	}
    
	
    
}
