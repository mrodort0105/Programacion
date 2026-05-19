package tema9;

import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            System.out.println("Por favor, introduzca 4 caracteres seguidos y pulse Intro:");
            
            // Leemos los bytes/caracteres directamente del flujo de entrada estándar
            int char1 = System.in.read();
            int char2 = System.in.read();
            int char3 = System.in.read();
            int char4 = System.in.read();

            // 1. Imprimir el primero con write (escribe un byte, hay que hacer flush)
            System.out.write(char1);
            System.out.flush(); // Fuerza la salida del buffer
            System.out.println(); // Salto de línea para separar el resultado

            // 2. Imprimir el segundo con print
            System.out.print((char) char2);
            System.out.println(); 

            // 3. Imprimir el tercero con println
            System.out.println((char) char3);

            // 4. Imprimir el cuarto con printf
            System.out.printf("%c%n", (char) char4);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}