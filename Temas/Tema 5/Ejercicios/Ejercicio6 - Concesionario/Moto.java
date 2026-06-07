package ejercicio7;

public class Moto extends Vehiculo {

    private boolean tieneSidecar;

    public Moto(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tiene sidecar: " + tieneSidecar);
    }

    @Override
    public void mover() {
        System.out.println("La motocicleta está en movimiento");
    }
}
