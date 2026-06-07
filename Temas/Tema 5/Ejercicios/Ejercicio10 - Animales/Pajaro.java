package ejercicio10;

public class Pajaro extends Animal{
	
    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pajaro canta: pipipipi");
    }

    @Override
    public String moverse() {
        return "El pajaro vuela alto";
    }
}
