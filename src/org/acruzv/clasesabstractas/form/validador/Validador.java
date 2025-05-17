package org.acruzv.clasesabstractas.form.validador;

public abstract class Validador {
    protected String mensaje;
    abstract public boolean esValido(String valor);

    abstract public String getMensaje();

    abstract public void setMensaje(String mensaje);
}
