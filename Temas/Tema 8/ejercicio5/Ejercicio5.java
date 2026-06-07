package ejercicio5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		// Creamos el conjunto de con envoltorios y genericos
		Set<Integer> conjunto = new HashSet<>();
		
		// añadimos 5 numeros 
		conjunto.add(1);
		conjunto.add(2);
		conjunto.add(3);
		conjunto.add(4);
		conjunto.add(5);
		
		// Mostramos contenido
		/*Pregunta: ¿Imprime referencia o contenido?
		 * Respuesta: en este caso imprime el contenido del conjunto*/
		System.out.println(conjunto);
		
		// Añade un numero repetido
		conjunto.add(3);
		
		/*Pregunta: ¿Permite duplicados?
		 * Respuesta: No admite duplicado*/
		System.out.println(conjunto);
		
		// Añade null 
		/*Pregunta: ¿Permite nulos?
		 * Respuesta: Si admite null*/
		conjunto.add(null);
		
		// Comprobamos
		System.out.println(conjunto);
		
		// Creamos nuevo conjunto y añadimos dos numero primo
        Set<Integer> primos = new HashSet<>();
        primos.add(2);
        primos.add(3);

        // Comprobamos el nuevo conjunto
        boolean esSubconjunto = conjunto.containsAll(primos); // .containsALL comprueba si todos los elementos del segundo conjunto estan en el primero
        System.out.println("¿Primos es subconjunto?: " + esSubconjunto);

        // 8. Lista final inicializada con el conjunto
        final List<Integer> lista = new ArrayList<>(conjunto);

        System.out.println("Lista: " + lista);

        // Prueba de modificación
        lista.add(10);
        lista.remove(0);

        System.out.println("Lista modificada: " + lista);

	}

}
