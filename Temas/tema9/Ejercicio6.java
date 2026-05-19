package tema9;

import java.io.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        File file = new File("datos.bin");

        // 1. ESCRITURA combinando FileOutputStream -> BufferedOutputStream -> DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(file)))) {
            
            dos.writeInt(42);
            dos.writeDouble(3.14159);
            dos.writeUTF("Hola desde los streams de bytes");
            System.out.println("Datos guardados con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. LECTURA combinando FileInputStream -> BufferedInputStream -> DataInputStream
        try (DataInputStream dis = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(file)))) {
            
            int numero = dis.readInt();
            double pi = dis.readDouble();
            String saludo = dis.readUTF();

            System.out.println("Leído entero: " + numero);
            System.out.println("Leído double: " + pi);
            System.out.println("Leído String: " + saludo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}