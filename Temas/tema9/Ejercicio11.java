package tema9;

import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio11 {
    private static final String ARCHIVO = "record.txt";

    public static void main(String[] args) {
        // Inicialización inicial para pruebas si el fichero no existe
        try (RandomAccessFile raf = new RandomAccessFile(ARCHIVO, "rw")) {
            if(raf.length() == 0) {
                raf.writeBytes("Nivel:001");
            }
        } catch (IOException e) { e.printStackTrace(); }

        // Parte 1: Saltar directamente al número y cambiarlo por 005
        try (RandomAccessFile raf = new RandomAccessFile(ARCHIVO, "rw")) {
            // "Nivel:" ocupa 6 caracteres/bytes (posiciones 0 a 5). El número empieza en la posición 6
            raf.seek(6);
            raf.writeBytes("005");
            System.out.println("Fichero actualizado inicialmente a 005.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Parte 2: Preguntar al usuario su nivel deseado y guardarlo rellenando con ceros
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        try (RandomAccessFile raf = new RandomAccessFile(ARCHIVO, "rw")) {
            System.out.print("Introduce el nivel que quieres ponerte (ej: 7, 23, 105): ");
            int nivelInput = Integer.parseInt(lector.readLine());
            
            // Damos formato string rellenando con ceros a la izquierda para mantener la longitud de 3 caracteres
            String nivelFormateado = String.format("%03d", nivelInput);
            
            raf.seek(6); // Volvemos a saltar "Nivel:"
            raf.writeBytes(nivelFormateado);
            System.out.println("¡Nivel actualizado a " + nivelFormateado + " de forma exitosa!");
            
        } catch (Exception e) {
            System.out.println("Error en la operación o entrada incorrecta.");
        }
    }
}