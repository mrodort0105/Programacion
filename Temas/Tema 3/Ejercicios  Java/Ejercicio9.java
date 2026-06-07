package ejercicioClase;

import java.util.Scanner;

public class Ejercicio_009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.print("¿Esta lloviendo? (true/false): ");
        boolean llueve = sc.nextBoolean();

        System.out.print("terminaste tus tareas? (true/false): ");
        boolean tareasTerminadas = sc.nextBoolean();

        System.out.print("necesitas ir a la biblioteca? (true/false): ");
        boolean irBiblioteca = sc.nextBoolean();

        boolean puedeSalir = (!llueve && tareasTerminadas) || irBiblioteca;

        // Mostramos el resultado final
        System.out.println("Puedes salir a la calle?: " + puedeSalir);

    }
}

