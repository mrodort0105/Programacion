package ejercicio9;

public class Main {

	public static void main(String[] args) {
		
		Libro l1 = new Libro("La historia de Maduro", "Trump", 19216811, 2025);
		Libro l2 = new Libro("La historia de Chavez", "Maduro", 23145322, 2013);
		Libro l3 = new Libro("La traicion de Capriles", "El pueblo", 64564434, 2016);
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		
		System.out.println(l1.equals(l3));
		System.out.println(l2.equals(l3));
		System.out.println(l2.equals(l1));
		
	}
}
