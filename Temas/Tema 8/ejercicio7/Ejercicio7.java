package Tema8.Ejercicios.ejercicio7;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;

public class Ejercicio7 {
    public static void main(String[] args) {

        // 1. Crear el conjunto vacío usando la interfaz Set
        // uso LinkedHashSet para que respete el orden de entrada
        Set<String> alumnos = new LinkedHashSet<>();

        // 2. Agregar nombres de alumnos
        alumnos.add("Fran");
        alumnos.add("Ana");
        alumnos.add("Luis");
        alumnos.add("Marta");

        // 3. Imprime el conjunto para ver su contenido
        // ¿Referencia o valor? Imprime el valor porque tiene el toString sobreescrito
        System.out.println("Lista de alumnos: " + alumnos);

        // 4. Añadir un repetido
        // ¿Permite duplicados? no porque los Set nunca dejan repetir elementos
        alumnos.add("Fran");
        System.out.println("Tras intentar repetir a Fran: " + alumnos);

        // 5. añadir un null
        // ¿Permite nulos? si admite uno
        alumnos.add(null);
        System.out.println("Tras añadir un null: " + alumnos);

        // 6. Recorrido en orden de inserción con el prefijo "D."
        System.out.println("\nRecorrido ordenado(LinkedHashSet)");
        for (String nombre : alumnos) {
            if (nombre != null) {
                System.out.println("D. " + nombre);
            } else {
                System.out.println("D. [Nulo]");
            }
        }
        // Comparación con HashSet
        Set<String> alumnosHashSet = new HashSet<>();
        alumnosHashSet.add("Fran");
        alumnosHashSet.add("Ana");
        alumnosHashSet.add("Luis");
        alumnosHashSet.add("Marta");
        alumnosHashSet.add(null);

        // Al imprimir verás que el orden NO es el de entrada [cite: 448]
        System.out.println("\nComparación con HashSet:");
        System.out.println(alumnosHashSet);
    }
}