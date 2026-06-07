package Tema8.Ejercicios.ejercicio9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // TreeSet
        Set<Persona> listaNatural = new TreeSet<>();

        // añadir personas
        listaNatural.add(new Persona("Fran", "Gomez", 30));
        listaNatural.add(new Persona("Ana", "Perez", 25));
        listaNatural.add(new Persona("Luis", "Lopez", 40));
        listaNatural.add(new Persona("Ana", "Perez", 25)); // Intento de repetido

        // imprimir nombres
        System.out.println("Colección ordenada por nombre: " + listaNatural);

        // comprobar igualdad y hash
        Persona p1 = new Persona("Ana", "Perez", 25);
        Persona p2 = new Persona("Ana", "Perez", 80); // Misma persona, distinta edad

        System.out.println("¿Son p1 y p2 la misma persona?: " + p1.equals(p2));
        System.out.println("HashCode p1: " + p1.hashCode());
        System.out.println("HashCode p2: " + p2.hashCode());

        // copiar la coleccion con el orden sde inserccion
        Set<Persona> listaInsercion = new LinkedHashSet<>(listaNatural);
        System.out.println("Colección por orden de inserción: " + listaInsercion);
    }
}