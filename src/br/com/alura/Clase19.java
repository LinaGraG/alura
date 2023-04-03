package br.com.alura;


import br.com.alura.model.Alumno;
import br.com.alura.model.Curso;

import java.util.Collection;
import java.util.HashSet;


public class Clase19 {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Historia", 30);

        Alumno alumno1 = new Alumno("Luis", "001");
        Alumno alumno2 = new Alumno("Pepito", "002");
        Alumno alumno3 = new Alumno("Juan", "003");
        Alumno alumno4 = new Alumno("Pedro", "004");
        Alumno alumno5 = new Alumno("Theo", "005");
        Alumno alumno6 = new Alumno("Marcia", "006");
        Alumno alumno7 = new Alumno("Simona", "007");


        Collection<Alumno> listaAlumnos = new HashSet<>();

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno7);
        curso1.addAlumno(alumno6);


        //curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));


        Alumno alumnoMap = curso1.getAlumnoMap().get("003");

        curso1.getAlumnoMap().forEach((codigo, alumno) ->{
            System.out.println(alumno);

        });
        //System.out.println(alumnoMap);

    }

}
