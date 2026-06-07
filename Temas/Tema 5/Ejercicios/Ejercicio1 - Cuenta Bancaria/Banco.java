package ejericio1;

public class Banco {

	public static void main(String[] args) {

		// Creamos Cuentas bancarias
		CuentaBancaria Cuenta1 = new CuentaBancaria("Jhonal", 200.50);
		CuentaBancaria Cuenta2 = new CuentaBancaria("Fran", 400.12);
		CuentaBancaria Cuenta3 = new CuentaBancaria("Jose", 120);
		
		// Actualizamos los nombres
		Cuenta1.setTitular("Jhonal Jesus");
		Cuenta2.setTitular("Fran Gomez");
		Cuenta3.setTitular("Manuel Enrique");
		
		// Usamos los metodos
		Cuenta1.ingresar(14.75);
		Cuenta2.ingresar(20);
		Cuenta3.ingresar(25.10);
		
		// Mostramos estado de las cuentas
		System.out.println("Dinero ingresado:");
		System.out.println("Saldo Cuenta1: " + Cuenta1.getSaldo());
		System.out.println("Saldo Cuenta2: " + Cuenta2.getSaldo());
		System.out.println("Saldo Cuenta3: " + Cuenta3.getSaldo());
		
		
		Cuenta1.retirar(10);
		Cuenta2.retirar(8.50);
		Cuenta3.retirar(8.10);
		
		// Mostramos estado de las cuentas
		System.out.println("\nEstado de la cuenta:");
		System.out.println("Saldo Cuenta1: " + Cuenta1.getSaldo());
		System.out.println("Saldo Cuenta2: " + Cuenta2.getSaldo());
		System.out.println("Saldo Cuenta3: " + Cuenta3.getSaldo());
		
	}
}
