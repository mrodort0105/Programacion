package ejercicio10;

public abstract class Animal {
	
	// Atributos
	protected String nombre;
    protected int edad;

    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public abstract void hacerSonido();

    public abstract String moverse();
}
