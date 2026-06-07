package tema9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio5 {
    // Definición de las constantes de credenciales
    private static final String USUARIO_CORRECTO = "admin";
    private static final String PASSWORD_CORRECTA = "12345";

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int intentos = 3;
        boolean accesoConcedido = false;

        try {
            while (intentos > 0 && !accesoConcedido) {
                System.out.print("Usuario: ");
                String usuario = reader.readLine();
                
                System.out.print("Contraseña: ");
                String password = reader.readLine();

                if (USUARIO_CORRECTO.equals(usuario) && PASSWORD_CORRECTA.equals(password)) {
                    accesoConcedido = true;
                    System.out.println("¡Acceso concedido al sistema!");
                } else {
                    intentos--;
                    System.out.println("Credenciales incorrectas. Intentos restantes: " + intentos);
                }
            }

            if (!accesoConcedido) {
                System.out.println("Se han agotado los 3 intentos. Cuenta bloqueada.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}