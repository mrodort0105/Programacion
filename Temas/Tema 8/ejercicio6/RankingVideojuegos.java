package Tema8.Ejercicios.ejercicio6;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RankingVideojuegos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Set<String> juegos = new TreeSet<>();
            for (int i=0; i<5; i++) {
                System.out.print("Introduce el nombre del juego: ");
                juegos.add(teclado.nextLine());
            }
            System.out.println("Lista de juegos ordenadas de la A a la Z" + juegos);
    }
}
