package br.com.alura;


import br.com.alura.model.Alumno;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;


public class Clase14 {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Luis", "001");
        Alumno alumno2 = new Alumno("Pepito", "002");
        Alumno alumno3 = new Alumno("Juan", "003");
        Alumno alumno4 = new Alumno("Pedro", "004");
        Alumno alumno5 = new Alumno("Theo", "005");
        Alumno alumno6 = new Alumno("Marcia", "006");
        Alumno alumno7 = new Alumno("Simona", "007");


        Collection<Alumno> listaAlumnos = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno6);

        Alumno alumnoNuevo = new Alumno("Luis", "001");

        System.out.println(alumno1.equals(alumnoNuevo));

        System.out.println(listaAlumnos.contains(alumnoNuevo));
    }

}
