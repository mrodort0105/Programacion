package tema9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// 1. CREAR: Definición de la clase Item (Debe implementar Serializable)
class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String nombre;
    private double peso;
    private int valor;

    public Item(String nombre, double peso, int valor) {
        this.nombre = nombre;
        this.peso = peso;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public int getValor() {
        return valor;
    }
}

// Clase principal que engloba la ejecución del ejercicio
public class Ejercicio14 {

    public static void main(String[] args) {
        String rutaArchivo = "mochila.bin";

        // ==========================================
        // 2. GUARDAR: Crear la lista y almacenarla
        // ==========================================
        System.out.println("--- FASE 2: Guardando ítems en la mochila ---");
        List<Item> mochilaOriginal = new ArrayList<>();
        mochilaOriginal.add(new Item("Poción de vida", 0.5, 50));
        mochilaOriginal.add(new Item("Espada de acero", 4.2, 350));
        mochilaOriginal.add(new Item("Escudo de madera", 3.0, 120));
        mochilaOriginal.add(new Item("Anillo de oro", 0.1, 1000));
        mochilaOriginal.add(new Item("Mapa del tesoro", 0.2, 500));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            oos.writeObject(mochilaOriginal);
            System.out.println("¡Éxito! Se han guardado los 5 ítems en '" + rutaArchivo + "'.\n");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo.");
            e.printStackTrace();
        }

        // ==========================================
        // 3. RECUPERAR: Leer el archivo y sumar el valor
        // ==========================================
        System.out.println("--- FASE 3: Recuperando mochila y calculando total ---");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            
            // Leemos el objeto del archivo y hacemos el casting a List<Item>
            @SuppressWarnings("unchecked")
            List<Item> mochilaRecuperada = (List<Item>) ois.readObject();
            
            int valorTotal = 0;

            System.out.println("Contenido de la mochila recuperada:");
            for (Item item : mochilaRecuperada) {
                System.out.printf("- %s | Peso: %.1f kg | Valor: %d monedas%n", 
                        item.getNombre(), item.getPeso(), item.getValor());
                valorTotal += item.getValor();
            }
            
            System.out.println("\n>> EL VALOR TOTAL DE TU MOCHILA ES: " + valorTotal + " monedas. <<");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al recuperar el archivo.");
            e.printStackTrace();
        }
    }
}