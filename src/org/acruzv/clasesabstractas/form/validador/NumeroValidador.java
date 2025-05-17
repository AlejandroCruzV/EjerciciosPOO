package org.acruzv.clasesabstractas.form.validador;

public class NumeroValidador extends Validador {
    protected String mensaje = "El campo no puede ser null";

    @Override
    public boolean esValido(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
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
