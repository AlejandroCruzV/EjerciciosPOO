package org.acruzv.proyectotrabajadores.modelo;

public class Cliente extends Persona {
    private int IdCliente;
    private static int UltimoIdCliente;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.IdCliente = ++UltimoIdCliente;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    @Override
    public String toString() {
        return super.toString() +
                "IdCliente=" + IdCliente +
                "\n";
    }
}
