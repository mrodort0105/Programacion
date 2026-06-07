package tema9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Introduce tu nombre completo: ");
            String nombre = reader.readLine();
            
            int edad = 0;
            boolean edadValida = false;
            
            while (!edadValida) {
                System.out.print("Introduce tu edad: ");
                try {
                    edad = Integer.parseInt(reader.readLine());
                    edadValida = true; // Si no salta excepción, el número es válido
                } catch (NumberFormatException e) {
                    System.out.println("Error: La edad debe ser un número entero. Inténtalo de nuevo.");
                }
            }
            
            System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
