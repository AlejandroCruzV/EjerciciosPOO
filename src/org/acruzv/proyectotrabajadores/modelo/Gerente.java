package org.acruzv.proyectotrabajadores.modelo;

public class Gerente extends Empleado {
    private double presupuesto;



    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "presupuesto=" + presupuesto +
                "\n";
    }
}
