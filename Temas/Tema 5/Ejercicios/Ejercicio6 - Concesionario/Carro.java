package ejercicio7;

public class Carro extends Vehiculo {

    private int numPuertas;

    public Carro(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de puertas: " + numPuertas);
    }

    @Override
    public void mover() {
        System.out.println("El coche está en movimiento");
    }
}
