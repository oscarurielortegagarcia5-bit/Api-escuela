package com.example.alumnoapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.alumnoapi.dto.AcademiaResponse;
import com.example.alumnoapi.dto.AlumnoDto;
import com.example.alumnoapi.dto.AlumnoRequest;
import com.example.alumnoapi.dto.ApiResponse;
import com.example.alumnoapi.dto.EscuelaDto;
import com.example.alumnoapi.model.AlumnoApiModel;
import com.example.alumnoapi.service.AlumnoService;

@RestController
public class AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping("/api/alumnoEscuela")
    public ResponseEntity<AlumnoApiModel> obtenerAlumno() {
        return ResponseEntity.ok(alumnoService.consultarAlumno());
    }
    
    
    @PostMapping("/alumnoEscuela")
    public ResponseEntity<ApiResponse> crearAlumno(
            @RequestBody AlumnoRequest request) {

        alumnoService.crearAlumno(request);
        
        if(request.getApellido() == null || request.getApellido().equals("")) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ApiResponse(
                            false,
                            400,
                            "Se debe introducir el apellido"
                    ));
        }
        
        if(request.getColor().equals("morado")) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ApiResponse(
                            false,
                            400,
                            "No hay recursos para tener casas moradas"
                    ));
        }

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse(
                        true,
                        201,
                        "Se agregó el alumno de forma correcta"
                ));
    }
    
    
    
    @GetMapping("/api/academia")
    public ResponseEntity<AcademiaResponse> obtenerAcademia() {

        AlumnoDto alumno = new AlumnoDto(
                "Oscar",
                "Ortega",
                25
        );

        EscuelaDto escuela = new EscuelaDto(
                "UAEH",
                alumno
        );

        AcademiaResponse response = new AcademiaResponse(
                escuela,
                "Tiene buena calificación"
        );

        return ResponseEntity.ok(response);
    }

    
}
