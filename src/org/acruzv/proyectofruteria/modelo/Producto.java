package org.acruzv.proyectofruteria.modelo;

/**
 * DATE WRITEN: 12-05-2025
 *
 * @author ALEJANDRO CRUZ VELAZQUEZ
 * Ejercicio del curso en UDEMY "Máster Completo en Java de cero a experto" por Andrés Guzmán
 * Sección 18: Programación Orientada a Objetos: Herencia
 * Para la tarea se pide desarrollar un diseño orientado a objetos para un almacén y verdulería, como requerimiento vamos
 * a tener 4 clases de productos Fruta, Limpieza, Lacteo y NoPerecible, todas tiene en común dos atributos el
 * nombre (string) y precio (double) que deben heredar de la clase padre Producto, pero ademas cada una van a tener dos
 * atributos propios adicionales, sus métodos getter y constructor para inicializar los 4 atributos (los 2 del padre y
 * los 2 propios). Los atributos adicionales de cada clase se detalla en el siguiente diagrame de clase:
 * <p>
 * Para el ejemplo de la clase main se pide crear dos objetos por cada tipo de producto que deben ser almacenados en un
 * arreglo del tipo Producto, se debe mostrar iterando el arreglo, por cada uno el detalle completo, el precio, nombre y
 * los atributos adicionales.
 */
public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "------>" + "nombre='" + nombre + ", precio=" + precio + "\n\t";
    }
}
