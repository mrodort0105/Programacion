package ejercicio3;

public class Ejercicio3 {
	public static void main(String[] args) {

		Persona p = new Persona(3, "jhonal");

		try {
			p.setEdad(-5);
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}