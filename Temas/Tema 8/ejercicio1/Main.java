package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // lista nula
        List<Persona> lista = null;
        System.out.println("Lista inicial: " + lista);

        // ArrayList vacío
        lista = new ArrayList<>();
        System.out.println("Lista vacía: " + lista);

        // añadir 3 personas
        lista.add(new Persona("Ana"));
        lista.add(new Persona("Luis"));
        lista.add(new Persona("Carlos"));
        System.out.println("Tras añadir 3 personas: " + lista);

        // Obtener nombre ultima persona
        Persona ultima = lista.get(lista.size() - 1); // size nos da el total de elementos en la lista
        System.out.println("Última persona: " + ultima);

        // Modificar el nombre de la primera persona
        lista.get(0).setNombre("Ana Modificada"); // get(0) nos dice que es el primer elemento
        System.out.println("Tras modificar primera persona: " + lista);

        // Eliminar a la persona del medio
        int posicionCentral = lista.size() / 2; // size para calcular total de elementos y / 2 para dividir y encontrar el elemento del medio
        lista.remove(posicionCentral);
        System.out.println("Eliminamos a la persona dll medio: " + lista);

        // Recorrer lista
        System.out.println("Recorrido con for:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre());
        }

        // Añadir nueva persona y comprobar
        Persona nueva = new Persona("Marta");
        lista.add(nueva);
        System.out.println("Añadimo una nueva: " + lista);

        System.out.println("Marta esta en la lista: " + lista.contains(nueva));

        //  Vaciar lista
        lista.clear();
        System.out.println("Lista limpia: " + lista);

        // Comprobar si está vacía
        System.out.println("la lista esta limpia: " + lista.isEmpty());
    }
}
