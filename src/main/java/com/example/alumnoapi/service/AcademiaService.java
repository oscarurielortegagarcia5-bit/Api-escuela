package com.example.alumnoapi.service;

import com.example.alumnoapi.dto.AlumnoRequest;
import com.example.alumnoapi.dto.PadresRequest;
import com.example.alumnoapi.model.AcademiaApiModel;
import com.example.alumnoapi.model.AcademiaeApiModel;
import com.example.alumnoapi.model.AcademiapApiModel;
import com.example.alumnoapi.model.EjercicioModel;
import com.example.alumnoapi.model.PadresApiModel;

public interface AcademiaService {
	AcademiaApiModel consultarAlumno();
	AcademiaApiModel consultafiltradaAlumno();
	AcademiaeApiModel consultaAlumnoe();
	EjercicioModel aniversarioUniversidad();
	
	AcademiapApiModel crearAlumno(AlumnoRequest request);
	PadresApiModel crearPadre(PadresRequest request);
}
