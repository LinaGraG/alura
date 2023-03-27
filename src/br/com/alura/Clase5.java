package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase5 {

    //Métodos adicionales
    public static void main(String[] args) {

        Curso curso1 = new Curso("PHP", 30);
        Curso curso2 = new Curso("Ruby", 10);
        Curso curso3 = new Curso("JavaScript", 20);
        Curso curso4 = new Curso("Java", 50);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);
       /* Collections.sort(cursos);
        Collections.sort(cursos, Collections.reverseOrder());

        System.out.println(cursos);*/
        //retorna una lista nueva
        List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("PHP")).sorted(Comparator.comparing(Curso::getNombre).reversed()).collect(Collectors.toList());
        System.out.println(cursoList);

    }
}