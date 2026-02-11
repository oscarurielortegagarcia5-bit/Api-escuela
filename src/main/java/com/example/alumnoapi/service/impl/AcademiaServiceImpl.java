package com.example.alumnoapi.service.impl;

import org.springframework.stereotype.Service;

import com.example.alumnoapi.dao.AcademiaDao;
import com.example.alumnoapi.dto.AlumnoRequest;
import com.example.alumnoapi.dto.PadresRequest;
import com.example.alumnoapi.model.AcademiaApiModel;
import com.example.alumnoapi.model.AcademiaeApiModel;
import com.example.alumnoapi.model.AcademiapApiModel;
import com.example.alumnoapi.model.AlumnoModel;
import com.example.alumnoapi.model.ClasesModel;
import com.example.alumnoapi.model.EjercicioModel;
import com.example.alumnoapi.model.EscuelaModel;
import com.example.alumnoapi.model.PadresApiModel;
import com.example.alumnoapi.service.AcademiaService;


@Service
public class AcademiaServiceImpl implements AcademiaService {

    private final AcademiaDao academiaDao;

    public AcademiaServiceImpl(AcademiaDao academiaDao) {
        this.academiaDao = academiaDao;
    }
    


    @Override
    public AcademiaApiModel consultarAlumno() {
        // Aquí podrías meter lógica si quieres
        return academiaDao.obtenerAlumno();
    }
    
    @Override
    public AcademiaApiModel consultafiltradaAlumno() {
    	return academiaDao.filtrarAlumno();
    }
    
    @Override
    public AcademiaeApiModel consultaAlumnoe() {
    	return academiaDao.calificacionesAlumnoe();
    }
    
    @Override
    public EjercicioModel aniversarioUniversidad() {
    	return academiaDao.juntaUniversidad();
    }
    
    @Override
    public AcademiapApiModel crearAlumno(AlumnoRequest request) {
    	AlumnoModel alumno = new AlumnoModel(
    			request.getNombre(),
    			request.getApellido(),
    			request.getEdad()
    );
    	ClasesModel clases = new ClasesModel(
    			request.getMateria(),
    			request.getGrado(),
    			request.getGrupo()
    );
    	EscuelaModel escuela = new EscuelaModel();
    	escuela.setColor(request.getColor());
    	escuela.setNombre(request.getEscuela());
    	
    	return new AcademiapApiModel(alumno, clases, escuela);
    }
    
    @Override
    public PadresApiModel crearPadre(PadresRequest request) {
    	return null;
    }
}
