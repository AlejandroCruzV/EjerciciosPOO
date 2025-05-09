package org.acruzv.herencia.modelo;

/**
 * DATE WRITEN: 08-04-2025
 *
 * @author ALEJANDRO CRUZ VELAZQUEZ
 * Ejercicio del curso en UDEMY "Máster Completo en Java de cero a experto" por Andrés Guzmán
 * Sección 18: Programación Orientada a Objetos: Herencia
 */
public class Profesor extends Persona {
    private String asignatura;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, String email, int edad, String asignatura) {
        super(nombre, apellido, email, edad);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
