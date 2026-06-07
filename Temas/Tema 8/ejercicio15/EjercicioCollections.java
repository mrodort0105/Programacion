package ejercicio15;

import java.util.*;

public class EjercicioCollections {
	public static void main(String[] args) {

		List<Integer> puntuaciones = new ArrayList<>();

        // Añadir todos los elementos de golpe
        puntuaciones.addAll(Arrays.asList(450, 1200, 300, 800, 1500, 100));

		System.out.println("Lista original: " + puntuaciones);

		Collections.sort(puntuaciones);
		System.out.println("lista Ordenada: " + puntuaciones);

		int max = Collections.max(puntuaciones);
		int min = Collections.min(puntuaciones);

		System.out.println("Max: " + max);
		System.out.println("min: " + min);

		Collections.shuffle(puntuaciones);
		System.out.println("lista Desordenada: " + puntuaciones);
	}
}
