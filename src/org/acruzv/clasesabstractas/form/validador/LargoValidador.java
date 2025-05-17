package org.acruzv.clasesabstractas.form.validador;

public class LargoValidador extends Validador {
    protected String mensaje = "El campo debe tener un minimo %d y un maximo %d caracteres";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LargoValidador() {
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public boolean esValido(String valor) {
        this.mensaje = String.format(this.mensaje, this.min, this.max);
        if (valor == null) {
            return true;
        }
        int largo = valor.length();
        return (largo >= min && largo <= max);
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
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
