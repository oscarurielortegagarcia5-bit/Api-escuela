package com.example.alumnoapi.model;

public class ClasesModel {

    private String materia;
    private String ciclo;
    private String reprobadas;

    public ClasesModel() {
    }

    public ClasesModel(String materia, String ciclo, String reprobadas) {
        this.materia = materia;
        this.ciclo = ciclo;
        this.reprobadas = reprobadas;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getReprobadas() {
        return reprobadas;
    }

    public void setReprobadas(String reprobadas) {
        this.reprobadas = reprobadas;
    }
}
