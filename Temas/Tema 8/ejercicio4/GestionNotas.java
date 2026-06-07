package ejercicio4;

import java.util.ArrayList;

public class GestionNotas {

    public static void main(String[] args) {

        // Creamos array de entrada para simular la entrada
        String[] notasEntrada = {"7.5", "4.2", "9.0", "3.8", "6.5"};

        // ahora creamos uno de tipo double (arraylist con envoltorio double)
        ArrayList<Double> notas = new ArrayList<>();

        // hacemo un for each para hacer un cambio de string a double
        for (String notaTexto : notasEntrada) {
            Double nota = Double.parseDouble(notaTexto); // .parse es un metodo que convierte texto a numero
            notas.add(nota);
        }

        // Calculamos la nota media
        double suma = 0;

        for (Double nota : notas) {
            suma += nota; // Esto hace un unboxing automatico
        }

        Double media = suma / notas.size(); // Double en mayusculas porque es envoltorio

        // Creamos lista para añadir a las notas mayor o oigual a 5
        ArrayList<Double> aprobados = new ArrayList<>();

        for (Double nota : notas) {
            if (nota >= 5.0) {
                aprobados.add(nota);
            }
        }

        // mostramos resultados
        System.out.println("Notas: " + notas);
        System.out.println("Media: " + media);
        System.out.println("Aprobados: " + aprobados);
    }
}
