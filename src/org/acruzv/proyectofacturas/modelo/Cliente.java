package org.acruzv.proyectofacturas.modelo;

public class Cliente {
    private String nombre;
    private String rfc; // RegistroFederalDeContribuyentes similar a NIF (Identificación fiscal o tributaria)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}
