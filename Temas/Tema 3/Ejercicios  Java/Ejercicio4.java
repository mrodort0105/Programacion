package ejerciciosDeClase;

public class Ejercicio004 {

	public static void main(String[] args) {

		short maximo = Short.MAX_VALUE;
		short minimo = (short) (maximo + 1);
		
        System.out.println("Valor maximo del short: " + maximo);
        System.out.println("Valor al sumar 1 al maximo: " + minimo);

        if (minimo == Short.MIN_VALUE) {
        	System.out.println("el valor siguiente al maximo es el minimo");
      	} else {
      		System.out.println("el vamor siguiente al maximo no es el minimo");
		        }
		
	}

}
