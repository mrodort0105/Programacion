package ejercicio1;

public class Perro extends Animal implements Corredor {

    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }

    @Override
    public void moverse() {
        System.out.println("El perro camina");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Soy un perro");
    }

    @Override
    public void correr() {
        System.out.println("El perro corre");
    }
}
