package ejercicio4_1;

import ejercicio4_1.Persona;

public class Ciudad {
	public static void main(String[] args) {
		
		// Creamos personas (Constructor con parametros)
     /* Persona Juan = new Persona("Juan", 25, 1.75);
        Persona Jose = new Persona("Jose", 18, 1.80);
        Persona Maria = new Persona("Maria", 36, 1.65); */
        
        // Creamos personas (Constructor por defecto)
        Persona Pepe = new Persona();
        Persona Paco = new Persona();
        Persona anonimo = new Persona();
        
        /* Creamos persona (Contructor solo nombre) */
        Persona Jhonal = new Persona("Jhonal");
        
        /* Creamos persona (Constructor 4 parametros) */
       // Persona Manuel = new Persona("Manuel ", "Feo", 12, 1.80);
        
        /* Utilizamos la clase ENUN */
        DiaDeSemana Miercoles = DiaDeSemana.MIERCOLES;
        

        
        
        
        /* Utilizamos la clase DiaDeSemana en la clase Persona */
        // Persona loli = new Persona("Loli ", "Roca", 18, 1.65, DiaDeSemana.LUNES);
        
        // Creamos nueva persona usando la clase sexo
        Persona Maduro = new Persona("Nicolas ", "Maduro", 56, 1.90, DiaDeSemana.LUNES, Persona.Sexo.MASCULINO);

        
        // Mostramos datos
        System.out.println("Personas en la lista: \n");
     /* System.out.println(Juan);
        System.out.println(Jose);
        System.out.println(Maria);
        System.out.println(Pepe);
        System.out.println(Paco); */
        System.out.println(anonimo);
        System.out.println(Jhonal);
     // System.out.println(Manuel);
     // System.out.println(loli);
        System.out.println(Maduro);
        
        // Llamamos a los metodos creados
     /* Juan.cumplirAños();
        Juan.crecer(0.05);
        Maria.crecer(0.10);
        Jose.cumplirAños(); */
        anonimo.crecer(0.20);
        
        // mostramos datos despues de modificar
        System.out.println("\nDespues de cumplir años y crecer:\n");
     /* System.out.println(Juan);
        System.out.println(Jose);
        System.out.println(Maria); */
        System.out.println(anonimo);
        
    }
}

/**Pregutna 1: ¿Cual es el valor que tienen los atributos por defecto de pepe y paco?
 * 	R: Pepe y paco tiene por defecto y en orden (null, 0, 0.0)
 * Pregunta 2: Al crear un contructor con parametros de Persona ¿Que ocurre con el constructor por defecto?
 * 	R: El contructor por defecto se elimina automaticamente al crear un contructor con parametros
 * Pregunta 3: 
**/
