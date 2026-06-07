package ejerciciosDeClase;

public class Ejercicio_033 {

	public static int mayorMenor(int a, int b) {
	    int max = a;
	    	if (b > a)
	    		max = b;
	    return max;

	}
	
	public static int mayorMenor(int a, int b, int c) {
		int max = a;
		b = mayorMenor(max, b);
		
		if (b > max) {
			max = b;
		}
		
		if (c > max) {
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(mayorMenor(20, 40));
		System.out.println(mayorMenor(60, 70, 39));
	}

}
