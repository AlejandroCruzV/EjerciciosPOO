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
public class Empleado extends Persona {
    private double remuneracion;
    private int IdEmpleado;
    private static int IdUltimoEmpleado; //para autoincrementar ID


    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.IdEmpleado = ++IdUltimoEmpleado;//Se autoincrementa el ID
    }


    public double getRemuneracion() {
        return remuneracion;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public static int getIdUltimoEmpleado() {
        return IdUltimoEmpleado;
    }

    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion += remuneracion * porcentaje/100;
    }

    @Override
    public String toString() {
        return super.toString() +
                "remuneracion=" + remuneracion +
                ", IdEmpleado=" + IdEmpleado +
                "\n";
    }
}
