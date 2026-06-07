package ejercicio8;

public class EmpleadoFijo extends Empleado{

	// Atributos
	private double salarioMensual;
	
	// Constructor
	public EmpleadoFijo(String nombre, double salarioMensual) {
		super(nombre);
		this.salarioMensual = salarioMensual;
	}
	
	// Metodo
	@Override
	public double calcularSalario() {
		return salarioMensual;
	}

	// Getteers/Setters
	public double getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
}
