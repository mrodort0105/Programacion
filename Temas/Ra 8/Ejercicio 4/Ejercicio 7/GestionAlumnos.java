/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciostema8;

/**
 *
 * @author miguel
 */
import java.util.Set;
import java.util.LinkedHashSet;

public class GestionAlumnos {
    public static void main(String[] args) {
        // 1. Crear conjunto vacío usando la interfaz Set
        Set<String> alumnos = new LinkedHashSet<>();

        // 2. Agregar nombres de varios alumnos
        alumnos.add("Ana");
        alumnos.add("Beto");
        alumnos.add("Carlos");

        // 3. Imprimir el conjunto
        System.out.println("Contenido del conjunto: " + alumnos);
        // ¿Imprime referencia o valor? 


        // 4. Añadir un nombre repetido
        alumnos.add("Ana"); 


        // 5. Añadir un null
        alumnos.add(null);

        // 6. Recorrer con prefijo "D." en orden de inserción
        System.out.println("\nLista de alumnos con prefijo:");
        for (String alumno : alumnos) {
            System.out.println("D. " + alumno);
        }
    }
}