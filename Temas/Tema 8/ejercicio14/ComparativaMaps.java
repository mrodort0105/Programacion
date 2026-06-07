package ejercicio14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ComparativaMaps {
	public static void main(String[] args) {
		
		// Guarda clave-valor - no tiene orden
		HashMap<String, Integer> aleatorio = new HashMap<>();
		
		// Lo mismo que has pero tiene el orden de insercion 
		LinkedHashMap<String, Integer> insercion = new LinkedHashMap<>();
		
		// Guarda los datos ordenados por clave - en caso de nombres en orden alfabeticos
		TreeMap<String, Integer> alfabetico = new TreeMap<>();

		// Cargamos datos
		aleatorio.put("Jhonal", 85);
		aleatorio.put("Jesus", 92);
		aleatorio.put("Juan", 78);
		aleatorio.put("Pedro", 88);

		insercion.put("Jhonal", 85);
		insercion.put("Jesus", 92);
		insercion.put("Juan", 78);
		insercion.put("Pedro", 88);

		alfabetico.put("Jhonal", 85);
		alfabetico.put("Jesus", 92);
		alfabetico.put("Juan", 78);
		alfabetico.put("Pedro", 88);

		// Mostrar mapas
		mostrarMapa(aleatorio, "HashMap");
		mostrarMapa(insercion, "LinkedHashMap");
		mostrarMapa(alfabetico, "TreeMap");
	}

	// metodo para mostrar cualquier mapa, el Map permite pasar cualquiera de los usados
	public static void mostrarMapa(Map<String, Integer> mapa, String tipo) { 
		System.out.println("\n" + tipo);
		
		// Recorremos elemento por elemto, .Entry devuelve los valores como conjunto
		Iterator<Map.Entry<String, Integer>> it = mapa.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			System.out.println(entry.getKey() + " -  " + entry.getValue());
		}
	}
}
