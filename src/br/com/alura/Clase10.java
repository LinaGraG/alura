
package br.com.alura;

import br.com.alura.model.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Clase10 {


    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
        {
            add(new LinkedList<Integer>());
            add(new ArrayList<Integer>());

        }
    };

    //Métodos adicionales
    public static void main(String[] args) {

        Curso curso1 = new Curso("Historia", 30);
        Curso curso2 = new Curso("Algebra", 10);
        Curso curso3 = new Curso("Aritmetica", 20);
        Curso curso4 = new Curso("Geometria", 50);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        //System.out.println(cursos);
        Collections.sort(cursos,Comparator.comparing(Curso::getNombre).reversed());

        /*int tiempo = 0;
        for (Curso curso : cursos) {
            tiempo += curso.getTiempo();*/
        int mayor = 0;
        for (Curso curso : cursos) {
            if (curso.getTiempo() > mayor){
                mayor += curso.getTiempo();
            }

        }
        System.out.println(mayor);

        //System.out.println(cursos);
        List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("PHP")).sorted(Comparator.comparing(Curso::getNombre).reversed()).collect(Collectors.toList());
        //System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
        System.out.println(cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Curso::getTiempo).max().getAsInt());

    }


}
