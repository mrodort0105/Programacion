package ejercicioClase;

public class Ejercicio_008 {
    public static void main(String[] args) {

        // 3 <= 5 es true y 2 == 2 tambien es true
        // true y true = true
        boolean exp1 = 3 <= 5 && 2 == 2;

        // 3 <= 5 es true pero 2 > 10 es false
        // true y false = false
        boolean exp2 = 3 <= 5 && 2 > 10;

        // 1 != 2 es true y 5 < 3 es false
        // true y false = true (Si sale un true se queda true)
        boolean exp3 = 1 != 2 || 5 < 3;

        // (1 < 2) es true
        // !true = false (negacion)
        boolean exp4 = !(1 < 2);

        // Mostrar resultados
        System.out.println("3 <= 5 && 2 == 2 : " + exp1);  // true
        System.out.println("3 <= 5 && 2 > 10 : " + exp2);  // false
        System.out.println("1 != 2 || 5 < 3 : " + exp3);   // true
        System.out.println("!(1 < 2) : " + exp4);          // false
    }
}

