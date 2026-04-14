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
import java.util.TreeSet;

public class RetoArbolBinario {
    public static void main(String[] args) {
        
        // --- PARTE 1: NÚMEROS ENTEROS ---
        // Creamos el conjunto implementado por un árbol
        Set<Integer> numeros = new TreeSet<>();
        
        // Añadimos números en orden aleatorio (desordenado)
        numeros.add(50);
        numeros.add(10);
        numeros.add(35);
        
        System.out.println("--- Números en el Árbol (Ordenados de menor a mayor) ---");
        // Al recorrerlo, el árbol ya los entrega ordenados
        for (Integer n : numeros) {
            System.out.println(n);
        }

        System.out.println();

        // --- PARTE 2: NOMBRES DE ALUMNOS ---
        Set<String> alumnos = new TreeSet<>();
        
        // Añadimos nombres en desorden
        alumnos.add("Zulema");
        alumnos.add("Bernardo");
        alumnos.add("Alberto");
        
        System.out.println("--- Alumnos en el Árbol (Ordenados alfabéticamente) ---");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}