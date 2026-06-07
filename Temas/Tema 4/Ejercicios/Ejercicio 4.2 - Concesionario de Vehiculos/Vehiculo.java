package ejercicio4_2;

public class Vehiculo {

	// Atributos
	private String matricula;
	private String marca;
	private int anioFabricacion;
	private double precio;
	private TipoVehiculo tipo;
	
	// Constructor
	Vehiculo(String matricula, String marca, int anioFabricacion, double precio, TipoVehiculo tipo) {
		this.matricula = matricula;
		this.marca = marca;
		this.anioFabricacion = anioFabricacion;
		this.precio = precio;
		this.tipo = tipo;
	}
	
	// Metodo para saber si es antiguo
	boolean EsAntiguo() {
		if (this.anioFabricacion <= 2016) {
			System.out.println("El vehiculo cuya matricula " + matricula + " es antiguo");
			return true;
		} else {
			System.out.println("El vehiculo cuya matricula " + matricula +  " no es antiguo");
			return false;
		}
	}
	
	void AplicarDescuento(double porcentaje) {
		
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", anioFabricacion=" + anioFabricacion
				+ ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	
}
