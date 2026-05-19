package tema9;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) {
        String rutaFichero = "notas.txt";

        // 1. Añadir contenido al final (el parámetro 'true' en FileWriter activa el modo append)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaFichero, true))) {
            writer.newLine(); // Añade salto de línea previo
            writer.write("Texto añadido automáticamente desde Java.");
            System.out.println("Contenido añadido al fichero con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir: Asegúrate de crear el archivo 'notas.txt' primero.");
        }

        // 2. Mostrar el contenido entero por consola
        System.out.println("\n--- Contenido actual del fichero ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaFichero))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}