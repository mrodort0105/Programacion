package ejercicio4_1;

public class Persona {

	// Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private double estatura;
    DiaDeSemana dia;
    Sexo sexo;
    
    // Constructor (Con parametros)
    public Persona(String nombre, String apellido, int edad, double estatura, DiaDeSemana dia) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.dia = dia;
    }
    
    // Constructor (Con 4 parametros)
    public Persona(String nombre, String apellido, int edad, double estatura, DiaDeSemana dia, Sexo sexo) {
    	this(nombre + apellido, apellido, edad, estatura, dia);
    	this.apellido = apellido;
    	this.sexo = sexo;
    }
    
    // Constructor (Por defecto)
    Persona() {
    	this.nombre  = "anonimo";
    	this.edad = 18;
    	this.estatura = 1.70;
    }
    
    // Constructor (Solo el nombre)
    Persona(String nombre) {
    	this.nombre = nombre;    	
    }
    
    // Constructor (solo apellido)
    
    
    // Metodo para incrementar la edad en uno
    public void cumplirAños() {
        edad++; // Aumenta la edad en 1
    }
    
    // Metodo para incrementar la estatura segun un valor dado
    public void crecer(double incremento) {
        estatura += incremento; 
    }
    
    public enum Sexo {
    	MASCULINO, FEMENINO
    }

    // Metodo toString para representar a la persona como una cadena
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Estatura: " + estatura + ","
        		+ " Dia: " + dia + ", Sexo: " + sexo;
    }
}