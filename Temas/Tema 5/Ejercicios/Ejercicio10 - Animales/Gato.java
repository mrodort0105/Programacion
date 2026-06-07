package ejercicio10;

public class Gato extends Animal{
	
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El Gato maulla: Miau Miua");
    }

    @Override
    public String moverse() {
        return "El gato trepa paredes";
    }
}