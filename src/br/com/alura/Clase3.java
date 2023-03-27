package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3 {
    public static void main(String[] args) {

        String curso1 = "Geometria";
        String curso2 = "Fisica";
        String curso3 = "Quimica";
        String curso4 = "Historia";

        ArrayList <String> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

       /* //se utliza para ordenar collections,sort,stream

       System.out.println(cursos);
        //ordenar de forma ascendente
        Collections.sort(cursos);
        System.out.println(cursos);

        //ordenar de forma descendente
        Collections.sort(cursos,Collections.reverseOrder() );
        System.out.println(cursos);*/

       /* cursos.sort(Comparator.reverseOrder());  //orden menor a mayor
        System.out.println(cursos);

        cursos.sort(Comparator.naturalOrder()); //orden natural
        System.out.println(cursos);*/

        //listas
        List<String>cursoList = cursos.stream().sorted().collect(Collectors.toList());
        System.out.println(cursoList);

        List<String> cursosList = cursos.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(cursosList);


        }
            
        }
