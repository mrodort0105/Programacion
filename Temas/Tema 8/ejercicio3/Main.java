package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear lista de nombres
        List<String> nombres = new ArrayList<>();

        // Añadir al menos 5 nombres iniciales
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Marta");
        nombres.add("Sofía");

        // Mostrar nombres
        mostrarNombres(nombres);

        // Añadir nuevo nombre por teclado
        System.out.print("\nIntroduce un nuevo nombre: ");
        String nuevoNombre = sc.nextLine();

        nombres.add(nuevoNombre);

        // Mostrar lista actualizada
        System.out.println("\nLista después de añadir:");
        mostrarNombres(nombres);

        // Eliminar un nombre específico
        System.out.print("\nIntroduce el nombre a eliminar: ");
        String nombreEliminar = sc.nextLine();

        if (nombres.contains(nombreEliminar)) {
            nombres.remove(nombreEliminar);
            System.out.println("Nombre eliminado correctamente.");
        } else {
            System.out.println("El nombre no se encuentra en la lista.");
        }

        // Mostrar lista final
        System.out.println("\nLista final:");
        mostrarNombres(nombres);

        // Mostrar número total de nombres
        System.out.println("\nTotal de nombres: " + nombres.size());

    }

    // Mostrar la lista
    public static void mostrarNombres(List<String> lista) {
        for (String nombre : lista) {
            System.out.println(nombre);
        }
    }
}
