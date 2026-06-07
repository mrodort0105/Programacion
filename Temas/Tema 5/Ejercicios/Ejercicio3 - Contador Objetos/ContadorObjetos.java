package ejercicio4;

class ContadorObjetos {

	private static int totalObjetos = 0;
	
	ContadorObjetos() {
		totalObjetos++;
		
	}
	
	static void mostrarTotalObjetos() {
		System.out.println("Total de Objetos: " + totalObjetos);
	}
}

