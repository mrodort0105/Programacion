package ejercicio13;

import java.util.HashMap;
import java.util.Map;

public class InventarioFruteria {
    public static void main(String[] args) {

    	// Creamos mapa
        HashMap<String, Integer> inventario = new HashMap<>();

        // Añadimos productos y catidades
        inventario.put("Manzanas", 50);
        inventario.put("Cambures", 20);
        inventario.put("Naranjas", 35);
        inventario.put("Peras", 12);

        // Mostramos la cantidad de una fruta
        System.out.println("Cantidad de Naranjas: " + inventario.get("Naranjas"));

        // Actualizamos y añadimos mas cantidad
        inventario.put("Manzanas", 100);
        
        // Verificamos con un if
        if (inventario.containsKey("Mango")) {
        	System.out.println("Producto encontrado");
        } else {
        	System.out.println("Producto no encontrado");
        }
        
        // Imprimiendo el mapa de varias maneras
        
        System.out.println("Mapa con println: " + inventario);


    }
}