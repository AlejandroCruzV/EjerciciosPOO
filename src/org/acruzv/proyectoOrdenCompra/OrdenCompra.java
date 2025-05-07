package org.acruzv.proyectoOrdenCompra;

import java.util.Date;

/**
 * DATE WRITEN: 22-03-2025
 * @author ALEJANDRO CRUZ VELAZQUEZ
 * Se requiere crear la clase OrdenCompra con los siguientes campos privados:
 *      identificador tipo Integer autoincremental,
 *      descripcion String,
 *      fecha tipo Date,
 *      cliente del tipo Cliente
 *      y finalmente un atributo de tipo arreglo de productos con 4 elementos: Producto[] productos.
 * En la clase OrdenCompra, crear constructor que inicialice solo la descripción.
 * En la clase OrdenCompra, crear métodos getter para todos los atributos.
 * En la clase OrdenCompra implementar sólo métodos set para cliente y fecha.
 *
 * Respecto a los productos de la clase OrdenCompra, sólo se pueden agregar usando el método
 * public void addProducto (Producto producto), nada más, es decir no se pueden agregar en el constructor ni en métodos setter.
 *
 * La clase OrdenCompra debe tener un método que devuelva el gran total, sumando los precios de los productos.
 *
 */
public class OrdenCompra {
    private int identifier;
    private String description;
    private Date date;
    private Cliente customer;
    private Producto[] productos=new Producto[4];
    private int indexProductos;

    private static int lastIdentifier; //Variable to control the Auto Increase in ID

    public OrdenCompra(String description) {
        this.description = description;
        this.identifier=++lastIdentifier; //Auto increase in ID variable at the moment of create a new OrdenCompra Object

    }

    public int getIdentifier() {
        return identifier;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Cliente getCustomer() {
        return customer;
    }

    public void setCustomer(Cliente customer) {
        this.customer = customer;
    }

    public Producto[] getProductos() {

        return productos;
    }

    public void addProducto (Producto producto){
        if (indexProductos< productos.length){
            productos[indexProductos++]=producto;
        }else{
            System.err.println("ERROR: LIMITE EXCEDITO, NO SE PUEDE AGREGAR MÁS PRODUCTOS");
        }

    }

    public float totalProducto (){
        float tot=0;

        for (int i = 0; i < productos.length; i++) {
            //No contemplará objetos nulos para evitar un NullPointerException
            if (productos[i].getName() != null || productos[i].getManufacturer() != null) {
                tot += productos[i].getPrice();
            }else {
                System.err.println("ERROR: Producto nulo, no contemplado para sumatoria total:"+productos[i].toString());
            }
        }
        return tot;
    }
}
