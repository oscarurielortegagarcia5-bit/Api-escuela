package com.example.alumnoapi.dao;

import com.example.alumnoapi.model.AcademiaApiModel;
import com.example.alumnoapi.model.AcademiaeApiModel;
import com.example.alumnoapi.model.EjercicioModel;

public interface AcademiaDao {
	
	AcademiaApiModel obtenerAlumno();
	AcademiaApiModel filtrarAlumno();
	AcademiaeApiModel calificacionesAlumnoe();
	EjercicioModel	juntaUniversidad();

}
