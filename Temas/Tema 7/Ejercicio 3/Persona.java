package ejercicio3;

public class Persona {

    private int edad;
    private String nombre;

    //constructor
	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    
}
