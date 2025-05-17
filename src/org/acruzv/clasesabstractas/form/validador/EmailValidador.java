package org.acruzv.clasesabstractas.form.validador;

public class EmailValidador extends Validador{
    private String mensaje = "El formato de email es invalido";
    private final static String EMAIL_REGEX="^(.+)@(.+)$";//REGEX = REgural EXpresion
    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje=mensaje;

    }
}
