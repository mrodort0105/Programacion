package Tema8.Ejercicios.ejercicio10;

import Tema8.Ejercicios.ejercicio9.Persona;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // crear  lista para poder usar diferentes ordenaciones
        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Manuel", "Fuentes", 30));
        lista.add(new Persona("Manuel", "Fuentes", 25));
        lista.add(new Persona("Luis", null, 40));

        // orden por edad
        System.out.println("Ordenar por edad: ");
        Collections.sort(lista, new ComparadorEdad());
        System.out.println(lista);

        // Orden por apellidos
        System.out.println("\nOrdenar por apellidos: ");
        Collections.sort(lista, new ComparadorCombinado());
        System.out.println(lista);

    }
}