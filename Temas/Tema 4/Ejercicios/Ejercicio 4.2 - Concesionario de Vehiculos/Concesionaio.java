package ejercicio4_2;

class Concesionaio {
	public static void main(String[] args) {

		// Creamos Vehiculos
		Vehiculo Fiat = new Vehiculo("AA745BN", "Fiat", 2015, 13.699, TipoVehiculo.TURISMO);
		Vehiculo Ford = new Vehiculo("BD782AD", "Ford", 2025, 23.699, TipoVehiculo.CAMION);
		Vehiculo Kawasaki = new Vehiculo("CD277FC", "Kawasaki", 2000, 3.699, TipoVehiculo.MOTO);
		
		//Mostramos Vehiculos
		System.out.println(Fiat);
		System.out.println(Ford);
		System.out.println(Kawasaki);
		
		// LLamamos al metodo
		Fiat.EsAntiguo();
		Ford.EsAntiguo();
		Kawasaki.EsAntiguo();
		
	}
}
