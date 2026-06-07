package Tema8.Ejercicios.ejercicio8;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio8 {
    public static void main(String[] args) {

        // Uso el TreeSet porque es la clase que ordena sola

        Set<Integer> numeros = new TreeSet<>();
        numeros.add(50);
        numeros.add(10);
        numeros.add(30);

        // Rrecorrer e imprimir el contenido
        System.out.println("Números ordenados automáticamente por el árbol:");
        for (Integer n : numeros) {
            System.out.println("- " + n);
        }

        // nombre de alumnos

        // crear TreeSet pero con String
        Set<String> alumnos = new TreeSet<>();
        alumnos.add("Zaira");
        alumnos.add("Ana");
        alumnos.add("Luis");

        System.out.println("\nAlumnos ordenados alfabéticamente:");
        for (String nombre : alumnos) {
            System.out.println("- " + nombre);
        }
    }
}