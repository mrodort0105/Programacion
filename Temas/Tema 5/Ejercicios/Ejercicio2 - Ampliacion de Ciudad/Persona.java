package ejercicio2;

class Persona {

    // Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private double estatura;
    DiaDeSemana dia;
    Sexo sexo;

    // Constructor (Con parametros)
    public Persona(String nombre, String apellido, int edad, double estatura, DiaDeSemana dia, Sexo sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
        this.dia = dia;
        this.sexo = sexo; 
    }

    // Metodo para incrementar la edad en uno
    public void cumplirAños() {
        edad++;
    }

    // Metodo para incrementar la estatura segun un valor dado
    public void crecer(double incremento) {
        estatura += incremento;
    }

    // Enum
    public enum Sexo {
        MASCULINO, FEMENINO
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + ", Edad: " + edad + ", Estatura: " + estatura +
               ", Dia: " + dia + ", Sexo: " + sexo;
    }

 // Get y Set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public DiaDeSemana getDia() {
		return dia;
	}

	public void setDia(DiaDeSemana dia) {
		this.dia = dia;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
}
