/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciostema8;

/**
 *
 * @author miguel
 */
import java.util.LinkedHashSet;

public class MemoriaPez {
    public static void main(String[] args) {
        LinkedHashSet<String> colores = new LinkedHashSet<>();
        
        // Añadimos colores en un orden específico
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Amarillo");
        colores.add("Violeta");
        
        System.out.println("--- Demostración de Memoria ---");
        System.out.println("Colores impresos en el orden exacto en que se escribieron:");
        
        for (String color : colores) {
            System.out.println("- " + color);
        }
    }
}