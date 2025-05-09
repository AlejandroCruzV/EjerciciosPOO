package org.acruzv.herencia;

import org.acruzv.herencia.modelo.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("NameStudent1");
        alumno.setApellido("SurnameStudent1");
        alumno.setInstitucion("University1");
        alumno.setcalificacionMateria1(7.9);
        alumno.setcalificacionMateria2(9.8);
        alumno.setcalificacionMateria3(6.8);

        AlumnoExtranjero alumnoExtranjero = new AlumnoExtranjero();
        alumnoExtranjero.setNombre("NameStudent2");
        alumnoExtranjero.setApellido("SurnameStudent2");
        alumnoExtranjero.setInstitucion("University2");
        alumnoExtranjero.setPais("France");
        alumnoExtranjero.setCalificacionClaseExtranjera1(10);
        alumno.setcalificacionMateria1(8.9);
        alumno.setcalificacionMateria2(7.8);
        alumno.setcalificacionMateria3(6.8);

        Profesor profesor = new Profesor();
        profesor.setNombre("NameTeacher1");
        profesor.setApellido("SurnameTeacher1");
        profesor.setAsignatura("Class1");

        System.out.println("Alumno: \t" + alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getInstitucion());
        System.out.println("Profesor: \t" + profesor.getAsignatura()
                + "\t" + profesor.getNombre() + " "
                + profesor.getApellido());
        System.out.println("Alumno Ext: \t" + alumnoExtranjero.getNombre()
                + " " + alumnoExtranjero.getApellido()
                + " " + alumnoExtranjero.getInstitucion()
                + " " + alumnoExtranjero.getPais());

        //Para recorrer la gerarquia de clases con toda la metadata
        Class clase = alumnoExtranjero.getClass();
        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " --> es una clase hija de la clase padre --> " + padre);
            clase = clase.getSuperclass();
        }

    }

}
