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
public class NoPerecible extends Producto {
    private int contenido;
    private int calorias;

    public NoPerecible(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return super.toString() +
                "contenido=" + contenido +
                ", calorias=" + calorias +
                "\n";
    }
}
