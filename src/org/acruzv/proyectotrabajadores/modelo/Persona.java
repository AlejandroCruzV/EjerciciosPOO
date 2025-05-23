package org.acruzv.proyectotrabajadores.modelo;

/**
 * DATE WRITEN: 09-05-2025
 *
 * @author ALEJANDRO CRUZ VELAZQUEZ
 * Ejercicio del curso en UDEMY "Máster Completo en Java de cero a experto" por Andrés Guzmán
 * Sección 18: Programación Orientada a Objetos: Herencia
 * <p>
 * <p>
 * Una compañía maneja empleados y clientes, entre los empleados hay gerentes que manejan presupuesto para su
 * área (modificable) y a todos los empleados se les puede aumentar el sueldo, se pide una jerarquía de clase de los
 * tipos de persona mencionados, tomando como base la figura del diagrama UML de clases.
 * <p>
 * Para todas las clases de la jerarquía tenga en cuenta los métodos getter, un constructor y el toString() con
 * sobre-escritura, para Gerente además el método setter de presupuesto.
 * <p>
 * También incluir una clase main con algún ejemplo de un Gerente e imprimir todos sus datos (y heredados) vía toString().
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String numeroFiscal;
    private String direccion;


    public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroFiscal='" + numeroFiscal + '\'' +
                ", direccion='" + direccion + '\'' +
                "\n";
    }
}
