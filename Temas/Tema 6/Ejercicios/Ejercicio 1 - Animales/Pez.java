package ejercicio1;

public class Pez extends Animal implements Nadador {

    @Override
    public void hacerSonido() {
        System.out.println("...");
    }

    @Override
    public void moverse() {
        System.out.println("El pez se mueve con la cola");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Soy un pez");
    }

    @Override
    public void nadar() {
        System.out.println("El pez nada");
    }
}
