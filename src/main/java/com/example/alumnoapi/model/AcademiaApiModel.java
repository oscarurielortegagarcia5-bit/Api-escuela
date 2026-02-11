package com.example.alumnoapi.model;

public class AcademiaApiModel {
	
    private AlumnoModel alumno;
    private ClasesModel clases;
    private EscuelaModel escuela;
    private MaestraModel maestra; 
    
    public AcademiaApiModel() {
    }

    public AcademiaApiModel(AlumnoModel alumno, ClasesModel clases, EscuelaModel escuela, MaestraModel maestra) {
        this.alumno = alumno;
        this.clases = clases;
        this.escuela = escuela;
        this.maestra = maestra;
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
    
    public MaestraModel getMaestra() {
        return maestra;
    }

    public void setMaestra(MaestraModel maestra) {
        this.maestra = maestra;
    }


}
