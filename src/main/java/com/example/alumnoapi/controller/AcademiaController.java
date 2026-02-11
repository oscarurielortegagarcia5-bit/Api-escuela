package com.example.alumnoapi.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.alumnoapi.dto.AcademiaApiResponse;
import com.example.alumnoapi.dto.AlumnoRequest;
import com.example.alumnoapi.dto.ApiResponse;
import com.example.alumnoapi.dto.PadresRequest;
import com.example.alumnoapi.model.AcademiaApiModel;
import com.example.alumnoapi.model.AcademiaeApiModel;
import com.example.alumnoapi.model.EjercicioModel;
import com.example.alumnoapi.service.AcademiaService;

import jakarta.validation.Valid;


@RestController
public class AcademiaController {

    private final AcademiaService academiaService;
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse> handleValidationErrors(
            MethodArgumentNotValidException ex) {

        String message = ex.getBindingResult()
                .getFieldErrors()
                .get(0)
                .getDefaultMessage();

        ApiResponse response = new ApiResponse(false, 400, message);

        return ResponseEntity.badRequest().body(response);
    }
    
    public AcademiaController(AcademiaService academiaService) {
        this.academiaService = academiaService;
    }

    @GetMapping("/api/academia")
    public ResponseEntity<AcademiaApiModel> obtenerAlumno() {
        return ResponseEntity.ok(academiaService.consultarAlumno());
    }
    
    @GetMapping("/api/academiafiltrada")
    public ResponseEntity<AcademiaApiResponse<AcademiaApiModel>> filtrarAlumno(){
    	AcademiaApiModel resultado = academiaService.consultafiltradaAlumno();
    	
    	if (resultado == null) {
    		return ResponseEntity.ok(new AcademiaApiResponse<>("Nada lol", null));
    	}
    	return ResponseEntity.ok(new AcademiaApiResponse<>("Datos encontrados",resultado));
    }
    
    @GetMapping("/api/calificaciones")
    public ResponseEntity<AcademiaeApiModel> calificacionesAlumnoe() {
        return ResponseEntity.ok(academiaService.consultaAlumnoe());
    }
    
    @GetMapping("/api/aniversario")
    public ResponseEntity<EjercicioModel> juntaUniversidad() {
        return ResponseEntity.ok(academiaService.aniversarioUniversidad());
    }
    
    @PostMapping("/api/alumnoEscuela")
    public ResponseEntity<ApiResponse> crearAlumno(
            @RequestBody AlumnoRequest request) {

        academiaService.crearAlumno(request);

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
    
    @PostMapping("/api/padres")
    public ResponseEntity<ApiResponse> crearPadre(
    		 @Valid @RequestBody PadresRequest request) {

        academiaService.crearPadre(request);

        if(request.getHasAcceptedTerms() == null || request.getHasAcceptedTerms() == false) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ApiResponse(
                            false,
                            400,
                            "El campo hasAcceptedTerms debe ser true para continuar con el registro"
                    ));
        }

        if(request.getActive() == false) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ApiResponse(
                            false,
                            400,
                            "El registro no puede darse de alta si active es false"
                    ));
        }

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse(
                        true,
                        201,
                        "Se agregó el padre de forma correcta"
                ));
    }
}
