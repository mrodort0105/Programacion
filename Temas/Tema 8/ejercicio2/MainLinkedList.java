package ejercicio2;

import ejercicio1.Persona;
import java.util.ArrayList;
import java.util.List;

public class MainLinkedList {

    public static void main(String[] args) {

        // Lista original (ArrayList del ejercicio 1)
        List<Persona> listaOriginal = new ArrayList<>();

        listaOriginal.add(new Persona("Ana"));
        listaOriginal.add(new Persona("Luis"));
        listaOriginal.add(new Persona("Carlos"));
        listaOriginal.add(new Persona("Marta"));

        // Nueva LinkedList
        LinkedList<Persona> listaLinked = new LinkedList<>();
        
        // Copiar elementos
        for (int i = 0; i < listaOriginal.size(); i++) {
            listaLinked.add(listaOriginal.get(i));
        }

        // Intercambiar primera y última
        int size = listaLinked.size();

        if (size > 1) {
            Persona primero = listaLinked.get(0);
            Persona ultimo = listaLinked.get(size - 1);

            listaLinked.set(0, ultimo);
            listaLinked.set(size - 1, primero);
        }

        // Mostrar resultado
        System.out.println("Lista LinkedList despues de intercambio:");

        for (int i = 0; i < listaLinked.size(); i++) {
            System.out.println(listaLinked.get(i).getNombre());
        }
    }
}