package ejercicio10;

public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: Guau Guau");
    }

    @Override
    public String moverse() {
        return "El perro corre";
    }
}