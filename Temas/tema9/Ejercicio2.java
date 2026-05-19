package tema9;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduzca varios caracteres y después pulse intro para finalizar");
        System.out.println("Introduzca su nombre:");

        StringBuilder nombre = new StringBuilder();
        try {
            int caracter;
            // Leer hasta que se detecte el salto de línea (Enter)
            while ((caracter = System.in.read()) != '\n' && caracter != '\r' && caracter != -1) {
                nombre.append((char) caracter);
            }

            // Eliminar restos del salto de línea del buffer si quedan (en Windows \r\n)
            if (caracter == '\r') {
                System.in.read(); // Consume el '\n' sobrante
            }

            System.out.println("Hola " + nombre.toString().trim() + "!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
