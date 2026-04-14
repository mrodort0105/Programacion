/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciostema8;

/**
 *
 * @author miguel
 */
import java.util.HashSet;
import java.util.Scanner;

public class Aduana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> paises = new HashSet<>();
        
        System.out.println("--- Control de Aduanas ---");
        
        while (paises.size() < 5) {
            System.out.print("Ingrese nombre del país: ");
            String nombre = sc.nextLine();
            
            // .add() devuelve 'false' si el elemento ya existe
            if (!paises.add(nombre)) {
                System.out.println("¡Ese ya pasó por la frontera!");
            }
        }
        
        System.out.println("\nTotal de países únicos registrados: " + paises.size());
    }
}