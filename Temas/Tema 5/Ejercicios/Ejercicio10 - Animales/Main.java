package ejercicio10;

public class Main {
	public static void main(String[] args) {
		
		Pajaro Turpial = new Pajaro("Turpial", 3);
		Perro Golden = new Perro("Golden", 4);
		Gato Gato = new Gato("Gato con botas", 20);
		
		System.out.println("Los animales se mueven");
		System.out.println(Turpial.moverse());
		System.out.println(Golden.moverse());
		System.out.println(Gato.moverse());
		
		System.out.println("\nLos animales hacen ruido");
		Turpial.hacerSonido();
		Golden.hacerSonido();
		Gato.hacerSonido();
		
		System.out.println("\nInformacion de los animales");
		Turpial.mostrarInformacion();
		Golden.mostrarInformacion();
		Gato.mostrarInformacion();
	}

}
