package com.example.alumnoapi.dto;

public class AlumnoRequest {
	
    private String nombre;
    private String apellido;
    private String edad;

    private String materia;
    private String grado;
    private String grupo;

    private String escuela;
    private String color;
    
    
	public AlumnoRequest() {
	}
    
	public AlumnoRequest(String nombre, String apellido, String edad, String materia, String grado, String grupo,
			String escuela, String color) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.materia = materia;
		this.grado = grado;
		this.grupo = grupo;
		this.escuela = escuela;
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getEscuela() {
		return escuela;
	}
	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
    



}
