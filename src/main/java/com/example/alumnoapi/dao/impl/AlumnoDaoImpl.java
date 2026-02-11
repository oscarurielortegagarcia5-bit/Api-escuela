package com.example.alumnoapi.dao.impl;

import org.springframework.stereotype.Repository;

import com.example.alumnoapi.dao.AlumnoDao;
import com.example.alumnoapi.model.AlumnoApiModel;
import com.example.alumnoapi.model.AlumnoModel;
import com.example.alumnoapi.model.ClasesModel;
import com.example.alumnoapi.model.EscuelaModel;

@Repository
public class AlumnoDaoImpl implements AlumnoDao {

    @Override
    public AlumnoApiModel obtenerAlumno() {
    	
    	AlumnoModel alumnoCarlos = new AlumnoModel("Carlos","Hernandez","19");
    	
    	ClasesModel escuelaUAEH = new ClasesModel("Mate","2do","3");

        AlumnoModel alumno = new AlumnoModel(
                "Oscar",
                "Garcia",
                "34"
        );

        ClasesModel clases = new ClasesModel(
                "Español",
                "2026",
                "0"
        );
        
        
        AlumnoModel alumno2 = new AlumnoModel();
        alumno2.setApellido("Manuel");
        
        
        EscuelaModel esucela = new EscuelaModel();
        

        return new AlumnoApiModel(alumno2, escuelaUAEH,esucela);
    }
}
