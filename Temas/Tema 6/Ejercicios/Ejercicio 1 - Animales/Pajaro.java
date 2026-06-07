package ejercicio1;

public class Pajaro extends Animal implements Volador {

    @Override
    public void hacerSonido() {
        System.out.println("Pio");
    }

    @Override
    public void moverse() {
        System.out.println("El pajaro se mueve volando");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Soy un pajaro");
    }

    @Override
    public void volar() {
        System.out.println("El pajaro vuela");
    }
}
