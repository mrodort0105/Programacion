package tema9;

import java.io.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        File archivo = new File("texto.txt");

        // Escritura simple usando BufferedWriter y FileWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write("Línea 1: Programación en Java\n");
            bw.write("Línea 2: Flujos de caracteres\n");
            bw.write("Línea 3: Fin del archivo\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Lectura usando BufferedReader para demostrar 'mark' y 'reset'
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            System.out.println("--- Leyendo la primera línea ---");
            System.out.println(br.readLine());

            // Ponemos una marca aquí. El argumento es cuántos caracteres se permite leer antes de perder la marca
            br.mark(100); 

            System.out.println("\n--- Leyendo la segunda línea ---");
            System.out.println(br.readLine());

            System.out.println("\n--- Hacemos RESET para volver a la marca ---");
            br.reset();

            System.out.println("--- Volvemos a leer la segunda línea de nuevo ---");
            System.out.println(br.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}