package com.example.alumnoapi.dao.impl;

import org.springframework.stereotype.Repository;

import com.example.alumnoapi.dao.AcademiaDao;
import com.example.alumnoapi.model.AcademiaApiModel;
import com.example.alumnoapi.model.AcademiaeApiModel;
import com.example.alumnoapi.model.AlumnoModel;
import com.example.alumnoapi.model.AlumnoeModel;
import com.example.alumnoapi.model.AniversarioModel;
import com.example.alumnoapi.model.ClasesModel;
import com.example.alumnoapi.model.EjercicioModel;
import com.example.alumnoapi.model.EscuelaModel;
import com.example.alumnoapi.model.EscuelaeModel;
import com.example.alumnoapi.model.EscuelahModel;
import com.example.alumnoapi.model.InstitutoModel;
import com.example.alumnoapi.model.LugarModel;
import com.example.alumnoapi.model.MaestraModel;

@Repository
public class AcademiaDaoImpl implements AcademiaDao {

    @Override
    public AcademiaApiModel obtenerAlumno() {
    	
    	AlumnoModel alumnoCarlos = new AlumnoModel("Carlos","Hernandez","19");
    	
    	ClasesModel claseMate = new ClasesModel("Mate","2do","3");
    	
    	EscuelaModel escuelaUAEH = new EscuelaModel ("verde", "UAEH");
    	
    	MaestraModel maestraMargarita = new MaestraModel ("Margarita","Mate", true);

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
        
        
        EscuelaModel escuela = new EscuelaModel();
        

        return new AcademiaApiModel(alumno2, claseMate,escuelaUAEH, maestraMargarita);
    }
    
    
    @Override
    public AcademiaApiModel filtrarAlumno() {
    	EscuelaModel escuelaIPN = new EscuelaModel();
        escuelaIPN.setNombre("Felipe Angeles");
        escuelaIPN.setColor("amarillo");
        
    	AlumnoModel alumnoCarlos = new AlumnoModel("Carlos","Hernandez","19");
    	AlumnoModel alumnoAna = new AlumnoModel("Ana","Hernandez","19");
    	ClasesModel claseMate = new ClasesModel("Mate","2do","3");
    	EscuelaModel escuelaUAEH = new EscuelaModel("verde", "UAEH");
    	MaestraModel maestraMargarita = new MaestraModel("Margarita","Mate", true);
    	String Nom = alumnoCarlos.getNombre(); 
    	String Nome = alumnoAna.getNombre();
    	if(Nome.charAt(0)== 'A' || Nome.charAt(0) == 'a') {
    		return new AcademiaApiModel(alumnoAna, claseMate, escuelaIPN, maestraMargarita);
    	}
    	else {
    		return null;
    	}
    	
    }
    
   @Override
   public AcademiaeApiModel calificacionesAlumnoe() {
	   AlumnoeModel alumno = new AlumnoeModel();
	   alumno.setNombre("Oscar");
	   alumno.setAlumno("Ortega");
	   alumno.setEdad(25);
	   
	   EscuelaeModel escuela = new EscuelaeModel();
	   escuela.setNombre("UAEH");
	   escuela.setAlumnoe(alumno);
	  
	   return new AcademiaeApiModel(escuela, "Tiene buena calificación");
   	}
   
   @Override
   public EjercicioModel juntaUniversidad() {
	   EscuelahModel escuela = new EscuelahModel("UAHE", "Universidad");
	   InstitutoModel instituto = new InstitutoModel(escuela);
	   
	   LugarModel lugar = new LugarModel("CDMX","4 pm");
	   AniversarioModel aniversario = new AniversarioModel(14,lugar);
	   
	   return new EjercicioModel(instituto, aniversario, "llegar temprano y estacionarse en la entrada principal");
   	}
   }

