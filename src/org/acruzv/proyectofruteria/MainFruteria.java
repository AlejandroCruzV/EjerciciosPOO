package org.acruzv.proyectofruteria;

import org.acruzv.proyectofruteria.modelo.*;

import java.util.ArrayList;

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

public class MainFruteria {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Fruta manzana = new Fruta("Manzana", 10.50, 0.100, "Verde");
        Fruta naranja = new Fruta("Naranja", 5, 0.120, "Naranja");
        Limpieza detergente = new Limpieza("Detergente", 25.75, "detergente liquido", 10);
        Limpieza suavizanteTelas = new Limpieza("Suavizante de telas", 55, "Suavizante con aroma", 3.125);
        NoPerecible lataAtun = new NoPerecible("Atun", 30, 3, 250);
        NoPerecible arroz = new NoPerecible("Arroz", 50, 1, 300);
        Lacteo leche = new Lacteo("Leche", 25, 1, 250);
        Lacteo queso = new Lacteo("Queso", 44, 1, 150);

        productos.add(manzana);
        productos.add(naranja);
        productos.add(detergente);
        productos.add(suavizanteTelas);
        productos.add(lataAtun);
        productos.add(arroz);
        productos.add(leche);
        productos.add(queso);

        for (Producto prod : productos) {
            System.out.println(prod.toString());
        }

    }

}
