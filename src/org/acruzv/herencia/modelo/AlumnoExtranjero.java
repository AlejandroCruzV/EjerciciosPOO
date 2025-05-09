package org.acruzv.herencia.modelo;

public class AlumnoExtranjero extends Alumno{
    private String pais;
    private double calificacionClaseExtranjera1;

    public AlumnoExtranjero() {
    }

    public AlumnoExtranjero(String nombre, String apellido, String email, int edad, String institucion, double calificacionMateria1, double calificacionMateria2, double calificacionMateria3, String pais, double calificacionClaseExtranjera1) {
        super(nombre, apellido, email, edad, institucion, calificacionMateria1, calificacionMateria2, calificacionMateria3);
        this.pais = pais;
        this.calificacionClaseExtranjera1 = calificacionClaseExtranjera1;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getCalificacionClaseExtranjera1() {
        return calificacionClaseExtranjera1;
    }

    public void setCalificacionClaseExtranjera1(double calificacionClaseExtranjera1) {
        this.calificacionClaseExtranjera1 = calificacionClaseExtranjera1;
    }
}
