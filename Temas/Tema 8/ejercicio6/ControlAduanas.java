package Tema8.Ejercicios.ejercicio6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ControlAduanas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Set<String> paises = new HashSet<>();
            while (paises.size() < 5) {
                System.out.println("Introduce un pais: ");
                String pais = teclado.nextLine();

            if (!paises.add(pais)) {
                System.out.println("El pais ya existe");
                }
            }
            System.out.println("Paises registrados: " + paises.size());
    }
}