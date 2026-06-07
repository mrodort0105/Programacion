package ejercicio8;

public class EmpleadoPorHoras extends Empleado{

	// Atributos
	private double horasTrabajadas;
	private double precioHora;
	
	// Constructor
	public EmpleadoPorHoras(String nombre, double horaTrabajadas, double precioHora) {
		super(nombre);
		this.horasTrabajadas = horaTrabajadas;
		this.precioHora = precioHora;
	}
	
	// Metodo
	@Override
	public double calcularSalario() {
		return horasTrabajadas * precioHora;
	}

	// Getters/Setters
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}
	
}
