package org.acruzv.clasesabstractas.form;

import org.acruzv.clasesabstractas.form.modelo.*;
import org.acruzv.clasesabstractas.form.validador.*;

import java.util.ArrayList;
import java.util.List;

public class MainForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());
        InputForm password = new InputForm("clave","password");
        password.addValidador(new RequeridoValidador()).addValidador(new LargoValidador(6,12));
        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador()).addValidador(new EmailValidador());
        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNulloValdador());
        Opcion java = new Opcion("1", "java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2", "python"));
        lenguaje.addOpcion(new Opcion("3", "cobol"));
        lenguaje.addOpcion(new Opcion("4", "java script"));
        lenguaje.addOpcion(new Opcion("5", "php"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='" + this.nombre + "' value='" + this.valor + "'>";
            }
        };
        saludar.setValor("Ej. campo deshabilitado");
        username.setValor("Aprendiendo Java"); //Comentado para validación de metodos abstractos validadores
        //username.setValor(""); //validación de metodos abstractos validadores
        password.setValor("abc123");//Comentado para validación de metodos abstractos validadores
        //password.setValor("abc3");//validación de metodos abstractos validadores
        email.setValor("john.doe@correo.com");//Comentado para validación de metodos abstractos validadores
        //email.setValor("john.doecorreo.com");//validación de metodos abstractos validadores
        edad.setValor("28");//Comentado para validación de metodos abstractos validadores
        //edad.setValor("28anios");//validación de metodos abstractos validadores
        experiencia.setValor("Mas de 5 años de exp.");
        java.setSelected(true);


        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(saludar);
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);

        for (ElementoForm elem : elementos) {
            System.out.println(elem.dibujarHtml());
            System.out.println("<br>");
        }
        elementos.forEach(e ->
        {
            if (!e.esValido()) {
                e.getErrores().forEach(err -> System.out.println(e.getNombre()+": "+err)
                );
            }
        });
    }
}
