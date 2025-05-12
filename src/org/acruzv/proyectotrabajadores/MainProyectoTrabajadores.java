package org.acruzv.proyectotrabajadores;

import org.acruzv.proyectotrabajadores.modelo.Cliente;
import org.acruzv.proyectotrabajadores.modelo.Empleado;
import org.acruzv.proyectotrabajadores.modelo.Gerente;

public class MainProyectoTrabajadores {
    public static void main(String[] args) {
        System.out.println("---------------------GERENTES--------------------------------------------------");
        Gerente gerente = new Gerente("Name Gerente1", "Surname Gerente1",
                "RFCG0001", "Address Gerente1", 30000);
        gerente.setPresupuesto(60000);
        gerente.aumentarRemuneracion(10);
        System.out.println(gerente);
        System.out.println("-----------------------------------------------------------------------");
        Gerente gerente2 = new Gerente("Name Gerente2", "Surname Gerente2",
                "RFCG0002", "Address Gerente2", 10000);
        gerente2.setPresupuesto(10000);
        gerente2.aumentarRemuneracion(20);
        System.out.println(gerente2);
        System.out.println("-----------------------------------------------------------------------");
        Gerente gerente3 = new Gerente("Name Gerente3", "Surname Gerente3",
                "RFCG0003", "Address Gerente3", 100000);
        gerente3.setPresupuesto(80000);
        gerente3.aumentarRemuneracion(25);
        System.out.println(gerente3);
        System.out.println("---------------------EMPLEADO--------------------------------------------------");
        Empleado empleado = new Empleado("Name Empleado1", "Surname Empleado1",
                "RFCE0001", "Address Empleado1", 100000);
        empleado.aumentarRemuneracion(50);
        System.out.println(empleado);
        System.out.println("-----------------------------------------------------------------------");
        Empleado empleado2 = new Empleado("Name Empleado2", "Surname Empleado2",
                "RFCE0002", "Address Empleado2", 100000);
        empleado2.aumentarRemuneracion(13);
        System.out.println(empleado2);
        System.out.println("---------------------CLIENTE--------------------------------------------------");
        Cliente cliente = new Cliente("Name Cliente1", "Surname Cliente1",
                "RFCC0001", "Address Cliente1");
        System.out.println(cliente);
        System.out.println("-----------------------------------------------------------------------");
        Cliente cliente2 = new Cliente("Name Cliente2", "Surname Cliente2",
                "RFCC0002", "Address Cliente2");
        System.out.println(cliente2);


    }
}
