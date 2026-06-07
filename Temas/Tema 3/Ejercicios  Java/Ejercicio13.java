package ejercicioClase;

public class Ejercicio_013 {
    public static void main(String[] args) {

       /** 10 + 5 * 2 > 20 && 4 == 4
         * La multiplicacion tiene preferencia ante la suma
         * Por lo que:
         * Primero: 5 * 2 = 10
         * Luego: 10 + 10 = 20
         * Comparacion: 20 > 20 = false
         * 4 == 4 = true
         * false && true = false **/
        boolean exp1 = 10 + 5 * 2 > 20 && 4 == 4;
        System.out.println("Expresion 1 = " + exp1);



       /** !(7 + 3 > 10) || 3 * 2 <= 6
         * El () indica que se hace primero lo que esta dentro
         * primero: 7 + 3 = 10
         * Luego: 10 > 10 = false
         * !false = true
         * 3 * 2 = 6
         * 6 <= 6 = true
         * true || true = true **/
        boolean exp2 = !(7 + 3 > 10) || 3 * 2 <= 6;
        System.out.println("Expresion 2 = " + exp2);

      /** 10 / 2 + 3 * 5 == 19 && true
        * / y * va antes que +
        * 10 / 2 = 5
        * 3 * 5 = 15
        * 5 + 15 = 20
        * 20 == 19 = false
        * false && true = false **/
        boolean exp3 = 10 / 2 + 3 * 5 == 19 && true;
        System.out.println("Expresion 3 = " + exp3);


      /** int x = 5; x += 3 * 2;
        * primero: 3 * 2 = 6
        * x += 6  → x = x + 6 = 11 **/
        int x = 5;
        x += 3 * 2;
        System.out.println("Expresion 4 (valor de x) = " + x);

      /**boolean b = false; b = !b || 7 % 2 == 1;
        * !b = !false = true
        * 7 % 2 = 1 = 1 == 1 = true
        * true || true = true **/
        boolean b = false;
        b = !b || 7 % 2 == 1;
        System.out.println("Expresion 5 (valor de b) = " + b);
    }
}

