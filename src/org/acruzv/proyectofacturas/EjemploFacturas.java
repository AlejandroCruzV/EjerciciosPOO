package org.acruzv.proyectofacturas;

import org.acruzv.proyectofacturas.modelo.*;

import java.util.Scanner;

public class EjemploFacturas {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("NombreCliente1");
        cliente.setRfc("RFC-CLIE01");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese descripcion para la factura");
        //String descFact = sc.nextLine();

        //Factura factura = new Factura(cliente, descFact);
        Factura factura = new Factura(cliente, sc.nextLine());

        Producto producto;
        /*String nombreProd;
        double precioProd;
        int cantProd;*/

        for (int i = 0; i < 3; i++) {
            producto = new Producto(); //Se creara un nuevo producto en cada iteracion
            System.out.print("Ingrese nombre de producto N° " + producto.getCodigo() + ": ");
            //nombreProd = sc.nextLine();
            //producto.setNombre(nombreProd);
            producto.setNombre(sc.nextLine());

            System.out.print("Ingrese precio de producto: ");
            //precioProd = sc.nextDouble();
            //producto.setPrecio(precioProd);
            producto.setPrecio(sc.nextDouble());

            System.out.print("Ingrese cantidad de producto: ");
            //cantProd = sc.nextInt();

            //ItemFactura item = new ItemFactura(producto, cantProd);
            //factura.addItemFactura(item);//se agrega el item al array de ItemFactura
            factura.addItemFactura(new ItemFactura(producto, sc.nextInt()));

            System.out.println();
            sc.nextLine();//Para mover el cursor de scanner a la siguiente linea al finalizar cada iteracion

        }
        System.out.println(factura.generaDetalle());
    }
}
