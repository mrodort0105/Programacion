package ejercicio1;

public class Gato extends Animal implements Corredor {

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }

    @Override
    public void moverse() {
        System.out.println("El gato se mueve en silencio");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Soy un gato");
    }

    @Override
    public void correr() {
        System.out.println("El gato corre");
    }
}
