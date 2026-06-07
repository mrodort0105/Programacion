package ejercicio2;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("COMIENZO PROGRAMA DIVISIÓN");

        try {
            System.out.print("Introduce el dividendo: ");
            int dividendo = sc.nextInt();

            System.out.print("Introduce el divisor: ");
            int divisor = sc.nextInt();

            // Llamada al método de división
            int resultado = dividirConIOException(dividendo, divisor);

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException ex) {
            System.out.println("Error aritmético: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error de E/S: " + ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("Error: debes introducir números enteros");
        } catch (Exception ex) {
            System.out.println("Error general: " + ex.getMessage());
        } finally {
            System.out.println("FIN PROGRAMA DIVISIÓN");
            sc.close();
        }

        // Ejemplo de paso por valor
        String t = "Java";
        modificarTitulo(t);
        System.out.println("Valor final de t: " + t); // sigue siendo "Java"
    }

    // Método de división que puede lanzar ArithmeticException y IOException
    public static int dividirConIOException(int dividendo, int divisor) throws ArithmeticException, IOException {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por 0");
        }
        // IOException si el dividendo es negativo
        if (dividendo < 0) {
            throw new IOException("Dividendo negativo provoca IOException");
        }
        return dividendo / divisor;
    }

    public static void modificarTitulo(String titulo) {
        titulo = "Nuevo título"; // no cambia el valor original
    }
}