package ejercicio1;

public class Main {
    public static void main(String[] args) {

        Animal[] animales = {
            new Perro(),
            new Gato(),
            new Pajaro(),
            new Pez()
        };

        for (Animal a : animales) {
            a.mostrarInfo();
            a.hacerSonido();
            a.moverse();
            System.out.println();
        }
    }
}
