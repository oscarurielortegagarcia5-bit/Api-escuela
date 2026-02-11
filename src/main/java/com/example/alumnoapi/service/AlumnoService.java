package com.example.alumnoapi.service;

import com.example.alumnoapi.dto.AlumnoRequest;
import com.example.alumnoapi.model.AlumnoApiModel;

public interface AlumnoService {
    AlumnoApiModel consultarAlumno();
    
    AlumnoApiModel crearAlumno(AlumnoRequest request);
}
