/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciostema8;

/**
 *
 * @author miguel
 */
import java.util.TreeSet;
import java.util.Scanner;

public class RankingJuegos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> juegos = new TreeSet<>();
        
        System.out.println("--- Ranking de Videojuegos ---");
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Juego " + i + ": ");
            juegos.add(sc.nextLine());
        }
        
        System.out.println("\nLista ordenada alfabéticamente:");
        System.out.println(juegos);
    }
}