package Tema8.Ejercicios.ejercicio11;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClubDeLectura club = new ClubDeLectura();

        // Agregar libros
        System.out.println("Introduce un libro");
        club.AgregarLibro(sc.nextLine());
        System.out.println("Introduce un libro");
        club.AgregarLibro(sc.nextLine());
        System.out.println("Introduce un libro");
        club.AgregarLibro(sc.nextLine());

        // mostrar biblioteca
        club.MostrarBiblioteca();

    }
}
