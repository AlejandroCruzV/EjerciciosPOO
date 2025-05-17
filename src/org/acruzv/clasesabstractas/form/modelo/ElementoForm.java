package org.acruzv.clasesabstractas.form.modelo;

import org.acruzv.clasesabstractas.form.validador.Validador;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementoForm {
    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        //Se inicializan los arrayList al momento de crear un nuevo elemento FORM
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getErrores() {
        return errores;
    }

    public ElementoForm addValidador(Validador validador) {
        this.validadores.add(validador);
        return this;
    }

    public boolean esValido() {
        for (Validador v : validadores) {
            if (!v.esValido(this.valor)) {
                this.errores.add(v.getMensaje());
            }
        }
        return this.errores.isEmpty(); //Regresa True si no hay errrores y falso si se cargaron valores
    }

    public abstract String dibujarHtml();
}
