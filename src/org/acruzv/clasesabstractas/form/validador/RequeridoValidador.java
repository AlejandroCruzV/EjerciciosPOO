package org.acruzv.clasesabstractas.form.validador;

public class RequeridoValidador extends Validador {
    protected String mensaje = "El campo es requerido";

    @Override
    public boolean esValido(String valor) {
        return (valor != null && !valor.isEmpty());//se puede usar tambien valor.length() > 0
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
