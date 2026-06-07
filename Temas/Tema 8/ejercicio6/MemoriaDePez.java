package Tema8.Ejercicios.ejercicio6;

import java.util.*;

public class MemoriaDePez {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Set<String> colores = new HashSet<>();
        colores.add("Amarillo");
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");

        System.out.println("Orden que recuerda Java: " + colores);
    }
}
