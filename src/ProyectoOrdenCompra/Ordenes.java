package ProyectoOrdenCompra;

import java.util.Date;

/**
 * DATE WRITEN: 23-03-2025
 * Ejercicio del curso en UDEMY "Máster Completo en Java de cero a experto" por Andrés Guzmán
 * Crear un proyecto nuevo llamado ProyectoOrdenCompra de la siguiente manera:
 * Se requiere crear la clase OrdenCompra con los siguientes campos privados: identificador tipo Integer autoincremental,
 * descripcion String, fecha tipo Date, cliente del tipo Cliente y finalmente un atributo de tipo arreglo de productos
 * con 4 elementos: Producto[] productos.
 * En la clase OrdenCompra, crear constructor que inicialice solo la descripción.
 * En la clase OrdenCompra, crear métodos getter para todos los atributos.
 * En la clase OrdenCompra implementar sólo métodos set para cliente y fecha.
 * Respecto a los productos de la clase OrdenCompra, sólo se pueden agregar usando el método
 * public void addProducto (Producto producto), nada más, es decir no se pueden agregar en el constructor ni en métodos setter.
 * La clase OrdenCompra debe tener un método que devuelva el gran total, sumando los precios de los productos.
 * Crear la clase Producto con tres atributos fabricante tipo String y nombre String y precio int, inicializar todos sus
 * valores en el constructor e implementar sus respectivos métodos getter.
 * Crear la clase Cliente con dos atributos nombre y apellido, inicializar todos sus valores en el constructor e
 * implementar sus respectivos métodos getter.
 *
 *
 *
 * Escribir un programa, clase con método main, la cual llamaremos EjemploOrdenes:
 *
 *      Crear tres órdenes, con sus respectivos valores, el cliente, agregar los cuatro productos a cada una, cada orden
 *      con distintos productos, que no se repitan.
 *
 *      Para cada una imprimir sus valores en consola usando método getter incluyendo los productos, donde con el método
 *      getter obtenemos el arreglo de productos y con un foreach recorremos e imprimimos sus atributos fabricante, nombre
 *      y precio. Tener en cuenta en la salida el gran total de cada orden, los clientes, todo.
 */
public class Ordenes {
    public static void main(String[] args) {
        //Se crean los productos para poder asignarcelos a las ordenCompra
        Producto producto1 = new Producto(Fabricante.SAMSUNG, "TV 50 pulgadas", 1000);
        Producto producto2 = new Producto(Fabricante.LG, "Refrigerador", 800);
        Producto producto3 = new Producto(Fabricante.SONY, "PlayStation 5", 500);
        Producto producto4 = new Producto(Fabricante.APPLE, "iPhone 15", 1200);
        Producto producto5 = new Producto(Fabricante.IKEA, "Silla de oficina", 150);
        Producto producto6 = new Producto(Fabricante.HP, "Laptop", 900);
        Producto producto7 = new Producto(Fabricante.NIKE, "Zapatos deportivos", 120);
        Producto producto8 = new Producto(Fabricante.ADIDAS, "Camiseta", 50);

        //Se llena informacion para la orden de compra 1
        OrdenCompra ordenC1=new OrdenCompra("Orden de compra1");
        ordenC1.setCustomer(new Cliente("Client1","Surname1"));
        ordenC1.setDate(new Date());

        ordenC1.addProducto(producto1);
        ordenC1.addProducto(producto2);
        ordenC1.addProducto(producto3);
        ordenC1.addProducto(producto4);
        ordenC1.addProducto(producto5);

        System.out.println("ordenC1.getIdentifier() = " + ordenC1.getIdentifier());
        System.out.println("ordenC1.getDescription() = " + ordenC1.getDescription());
        System.out.println("ordenC1.getCustomer() = " + ordenC1.getCustomer().getName()+"-"+ordenC1.getCustomer().getSurname());
        System.out.println("ordenC1.getDate() = " + ordenC1.getDate());
        for (Producto prod:ordenC1.getProductos()) {
            System.out.println("Manufacturer:"+prod.getManufacturer()+"\tProduct Name:"+prod.getName()+"\tProduct price"+prod.getPrice());
        }
        System.out.println("ordenC1totalProducto() = " + ordenC1.totalProducto());

        //Se llena informacion para la orden de compra 2
        OrdenCompra ordenC2=new OrdenCompra("Orden de compra2");
        ordenC2.setCustomer(new Cliente("Client2","Surname2"));
        ordenC2.setDate(new Date());

        ordenC2.addProducto(producto5);
        ordenC2.addProducto(producto6);
        ordenC2.addProducto(producto7);
        ordenC2.addProducto(producto8);

        System.out.println("ordenC2.getIdentifier() = " + ordenC2.getIdentifier());
        System.out.println("ordenC2.getDescription() = " + ordenC2.getDescription());
        System.out.println("ordenC2.getCustomer() = " + ordenC2.getCustomer().getName()+"-"+ordenC2.getCustomer().getSurname());
        System.out.println("ordenC2.getDate() = " + ordenC2.getDate());
        for (Producto prod:ordenC2.getProductos()) {
            System.out.println("Manufacturer:"+prod.getManufacturer()+"\tProduct Name:"+prod.getName()+"\tProduct price"+prod.getPrice());
        }
        System.out.println("ordenC3totalProducto() = " + ordenC2.totalProducto());


        //Se llena informacion para la orden de compra 3
        OrdenCompra ordenC3=new OrdenCompra("Orden de compra2");
        ordenC3.setCustomer(new Cliente("Client2","Surname2"));
        ordenC3.setDate(new Date());

        ordenC3.addProducto(producto1);
        ordenC3.addProducto(producto6);
        ordenC3.addProducto(producto3);
        ordenC3.addProducto(producto8);

        System.out.println("ordenC3.getIdentifier() = " + ordenC3.getIdentifier());
        System.out.println("ordenC3.getDescription() = " + ordenC3.getDescription());
        System.out.println("ordenC3.getCustomer() = " + ordenC3.getCustomer().getName()+"-"+ordenC3.getCustomer().getSurname());
        System.out.println("ordenC3.getDate() = " + ordenC3.getDate());
        for (Producto prod:ordenC3.getProductos()) {
            System.out.println("Manufacturer:"+prod.getManufacturer()+"\tProduct Name:"+prod.getName()+"\tProduct price"+prod.getPrice());
        }
        System.out.println("ordenC3totalProducto() = " + ordenC3.totalProducto());

    }
}
