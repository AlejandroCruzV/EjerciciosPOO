package org.acruzv.herencia.modelo;

/**
 * DATE WRITEN: 08-04-2025
 *
 * @author ALEJANDRO CRUZ VELAZQUEZ
 * Ejercicio del curso en UDEMY "Máster Completo en Java de cero a experto" por Andrés Guzmán
 * Sección 18: Programación Orientada a Objetos: Herencia
 */
public class Alumno extends Persona {
    private String institucion;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String email, int edad, String institucion, double calificacionMateria1, double calificacionMateria2, double calificacionMateria3) {
        super(nombre, apellido, email, edad);
        this.institucion = institucion;
        this.calificacionMateria1 = calificacionMateria1;
        this.calificacionMateria2 = calificacionMateria2;
        this.calificacionMateria3 = calificacionMateria3;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getcalificacionMateria1() {
        return calificacionMateria1;
    }

    public void setcalificacionMateria1(double calificacionMateria1) {
        this.calificacionMateria1 = calificacionMateria1;
    }

    public double getcalificacionMateria2() {
        return calificacionMateria2;
    }

    public void setcalificacionMateria2(double calificacionMateria2) {
        this.calificacionMateria2 = calificacionMateria2;
    }

    public double getcalificacionMateria3() {
        return calificacionMateria3;
    }

    public void setcalificacionMateria3(double calificacionMateria3) {
        this.calificacionMateria3 = calificacionMateria3;
    }
}
