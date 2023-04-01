package br.com.alura;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;


public class Clase12 {
    public static void main(String[] args) {

        String alumno1 = "Luis";
        String alumno2 = "Pepito";
        String alumno3 = "Juan";
        String alumno4 = "Pedro";
        String alumno5 = "Gustavo";
        String alumno6 = "Marcia";
        String alumno7 = "Marcia";
        String alumno8 = "Gustavo";

        Collection<String> listaAlumnos = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno6);

        /*for (String alumno: listaAlumnos) {
            System.out.println(alumno);
        }*/

        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno);
        });


    }

}
