/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author miguel
 */
import java.util.ArrayList;

public class GestionNotas {

    public static void main(String[] args) {
        // 1. Array de Strings inicial
        String[] notasEntrada = {"7.5", "4.2", "9.0", "3.8", "6.5"};

        // 2. Crear ArrayList de tipo Double
        ArrayList<Double> listaNotas = new ArrayList<>();

        // 3. Conversión (Parsing)
        for (String notaTexto : notasEntrada) {
            listaNotas.add(Double.valueOf(notaTexto));
        }

        // 4. Cálculo (Unboxing)
        double suma = 0;
        for (Double nota : listaNotas) {
            suma += nota;
        }
        double media = suma / listaNotas.size();

        // 5. Filtrado
        ArrayList<Double> aprobados = new ArrayList<>();
        for (Double nota : listaNotas) {
            if (nota >= 5.0) {
                aprobados.add(nota);
            }
        }

        System.out.println("Notas registradas: " + listaNotas);
        System.out.printf("Promedio final: %.2f%n", media);
        System.out.println("Lista de aprobados: " + aprobados);
    }
}