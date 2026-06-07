package ejercicio8;

public class Figura {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public double calcularArea() {
        return 0;
    }

    public void mostrarInformacion() {
        System.out.println("Figura: " + nombre);
        System.out.println("Área: " + calcularArea());
    }
}
