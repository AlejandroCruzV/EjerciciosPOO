package org.acruzv.proyectofacturas.modelo;

public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private static int ultimoCodigo;//Para autoincrementar el codigo automaticamente

    public Producto() {
        this.codigo = ++ultimoCodigo;//Auto incrementará el codigo cada que sea creada una Factura

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
}
