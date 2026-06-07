package ejercicio12;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ejercicio12 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10); 
        lista.add(20); 
        lista.add(30); 
        lista.add(40); 
        lista.add(50); 
        lista.add(60); 
        lista.add(70); 
        lista.add(80); 
        lista.add(90); 
        lista.add(100);

        ListIterator<Integer> it = lista.listIterator();

        System.out.println("Recorrer hacia delante:");

        while (it.hasNext()) {
            Integer numero = it.next();
            System.out.println(numero);

            if (numero > 50) {
                it.set(numero * 2);
            }
        }

        System.out.println("Lista con primera modificacion");
        System.out.println(lista);

        System.out.println("\nRecorrrer hacia atras");

        it = lista.listIterator(lista.size());

        while (it.hasPrevious()) {
            Integer numero = it.previous();
            System.out.println(numero);

            if (numero < 30) {
                it.set(numero + 25);
            }
        }

        System.out.println("Lista final:");
        System.out.println(lista);
    }
}