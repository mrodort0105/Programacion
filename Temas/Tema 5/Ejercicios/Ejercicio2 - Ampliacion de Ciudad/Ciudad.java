package ejercicio2;

import ejercicio2.Persona.Sexo;

public class Ciudad {
	public static void main(String[] args) {
		
		// Creamos Personas 
		Persona persona1 = new Persona("Jhonal", "Roca", 19, 1.80, DiaDeSemana.MARTES, Sexo.MASCULINO);
		Persona persona2 = new Persona("Fran", "Gomez", 38, 1.90, DiaDeSemana.MARTES, Sexo.MASCULINO);
		Persona persona3 = new Persona("Abelardo", "Shawa", 24, 1.70, DiaDeSemana.MIERCOLES, Sexo.MASCULINO);
		
		//Mostramos datos de las personas
		System.out.println("Personas creadas:");
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);
		
		persona3.setNombre("Elias"); // Modificamos el nombre de Abelardo usando set 
		// Comprobamos que se le modifico el nombre a Abelardo
		System.out.println("Se actualizo el nombre de Abelardo a: " + persona3.getNombre());
		
		persona1.cumplirAños(); // Utilizamos metodo para que la persona1 tenga 1 año mas
		persona2.setEdad(42);   // Utilizamos metodo set para actualizar la edad a 42
		persona3.crecer(0.10);	// Utilizamos metodo para que persona3 aumente su estatura
		
		//Mostramos datos de las personas
		System.out.println("\nPersonas actualizadas:");
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);
		
		
	}
}
