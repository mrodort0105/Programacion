package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // COMIENZO del programa
        System.out.println("COMIENZO PROGRAMA DIVISIÓN");

        try {
            // Pedimos datos al usuario 
            System.out.print("Introduce el dividendo: ");
            int dividendo = sc.nextInt(); // Puede lanzar InputMismatchException

            System.out.print("Introduce el divisor: ");
            int divisor = sc.nextInt(); // Puede lanzar InputMismatchException

            // Operación de división
            // Si divisor = 0 → se lanza ArithmeticException
            int resultado = dividendo / divisor;

            // Si NO hay excepcion el flujo seria
            // try → finally (NO entra en catch)
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException ex) {
            // Captura división por 0 (Imposible dividir por 0)
            System.out.println("Imposible dividir por 0");
            // Mostrar mensaje de la excepción
            System.out.println("Mensaje: " + ex.getMessage());

            // Mostrar traza del error
            ex.printStackTrace();

            // Flujo cuando hay excepción: try → catch → finally

        } catch (InputMismatchException ex) {
            // Si metes letras en lugar de numeros
            System.out.println("Error: debes introducir números enteros");

            // Esta excepción es mejor PREVENIRLA (hasNextInt),
            // pero aqui la estamos GESTIONANDO con catch

        } catch (Exception ex) {
            // Captura general (catch de tipo Exception)
            System.out.println("Error general: " + ex.getMessage());
        } 
        
        // capturar Throwable:
        catch (Throwable t) {
            // Captura cualquier error o excepción no prevista
            System.out.println("Se ha producido un error grave: " + t.getMessage());
            t.printStackTrace();
        }
        // Pero NO es recomendable porque incluye errores graves del sistema
        
        finally {
            // Este bloque SIEMPRE se ejecuta (donde siempre se cierra el fluo)
            System.out.println("FIN PROGRAMA DIVISIÓN");

            // Aquí se cierra el Scanner (flujo de entrada)
            sc.close();
        }

        // Ejemplo de paso por valor en Java 
        String t = "Java";
        modificarTitulo(t);
        System.out.println("Valor final de t: " + t);

        // Resultado: "Java". Esto pasa porque Java pasa parámetros por valor y String es inmutable
    }

    public static void modificarTitulo(String titulo) {
        // Este cambio NO afecta a la variable original
        titulo = "Nuevo título";
    }
}
