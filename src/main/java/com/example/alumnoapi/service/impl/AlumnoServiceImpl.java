package com.example.alumnoapi.service.impl;

import org.springframework.stereotype.Service;

import com.example.alumnoapi.dao.AlumnoDao;
import com.example.alumnoapi.dto.AlumnoRequest;
import com.example.alumnoapi.model.AlumnoApiModel;
import com.example.alumnoapi.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    private final AlumnoDao alumnoDao;

    public AlumnoServiceImpl(AlumnoDao alumnoDao) {
        this.alumnoDao = alumnoDao;
    }
    

    @Override
    public AlumnoApiModel consultarAlumno() {
        // Aquí podrías meter lógica si quieres
        return alumnoDao.obtenerAlumno();
    }
    
    @Override
    public AlumnoApiModel crearAlumno(AlumnoRequest request) {
        System.out.println("REQUEST POST Alumno");
        System.out.println("Nombre: " + request.getNombre());
        System.out.println("Apellido: " + request.getApellido());
        System.out.println("Edad: " + request.getEdad());
        System.out.println("Materia: " + request.getMateria());
        System.out.println("Grado: " + request.getGrado());
        System.out.println("Grupo: " + request.getGrupo());
        System.out.println("Escuela: " + request.getEscuela());
        System.out.println("Color: " + request.getColor());
        System.out.println("-------------------------");
        return null;
    }
    
}
