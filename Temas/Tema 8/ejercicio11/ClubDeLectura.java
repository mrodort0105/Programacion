package Tema8.Ejercicios.ejercicio11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ClubDeLectura {
    private Set<String> biblioteca;

    public ClubDeLectura() {
        biblioteca = new HashSet<String>();
    }

    public void AgregarLibro(String libro) {
        if (biblioteca.add(libro)) {
            System.out.println(libro + " ha sido añadido correctamente.");
        } else {
            System.out.println("Error el libro: " + libro + "ya está en la biblioteca");
        }
    }

    public void MostrarBiblioteca() {
        System.out.println("Libros de la biblioteca:");

        Iterator<String> it = biblioteca.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
