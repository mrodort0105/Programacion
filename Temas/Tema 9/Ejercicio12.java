package tema9;

import java.io.File;
import java.io.RandomAccessFile;
import java.io.IOException;

public class Ejercicio12 {
    public static void main(String[] args) {
        File file = new File("abecedario.txt");

        // 1. Controlar si existe y borrarlo
        if (file.exists()) {
            file.delete();
            System.out.println("Fichero existente borrado.");
        }

        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            // 2. Introducir "defg"
            raf.writeBytes("defg");

            // 3. Imprimir el contenido actual
            System.out.println("Contenido inicial: " + leerFicheroCompleto(raf));

            // 4. Modificar contenido insertando al principio y al final
            // Dado que insertar al principio destruye/pisa si escribimos encima en modo directo, 
            // la forma correcta con acceso aleatorio es mover los bloques o leer el contenido, mutarlo en memoria y reescribir.
            raf.seek(0);
            byte[] bufferOriginal = new byte[(int) raf.length()];
            raf.readFully(bufferOriginal);
            String textoOriginal = new String(bufferOriginal);

            String nuevoTexto = "abc" + textoOriginal + "hij";
            
            // 5. Sustituir las vocales por '*'
            nuevoTexto = nuevoTexto.replaceAll("[aeiouAEIOU]", "*");

            // Reescribimos desde la posición 0 del fichero todo el contenido modificado
            raf.seek(0);
            raf.writeBytes(nuevoTexto);
            
            // Imprimir el resultado final
            raf.seek(0);
            System.out.println("Contenido Final transformado: " + leerFicheroCompleto(raf));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String leerFicheroCompleto(RandomAccessFile raf) throws IOException {
        long posicionActual = raf.getFilePointer(); // Guardamos puntero
        raf.seek(0);
        byte[] bytes = new byte[(int) raf.length()];
        raf.readFully(bytes);
        raf.seek(posicionActual); // Restauramos puntero
        return new String(bytes);
    }
}