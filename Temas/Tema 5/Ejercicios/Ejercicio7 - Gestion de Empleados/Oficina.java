package ejercicio8;

public class Oficina {
	public static void main(String[] args) {

		// Array de empleados
        Empleado[] empleados = new Empleado[2];

        // Empleados
        empleados[0] = new EmpleadoFijo("Ana", 1800);
        empleados[1] = new EmpleadoPorHoras("Luis", 10, 120);

        // Recorrer el array y mostrar datos
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + " - Salario: " + empleado.calcularSalario()
            );
        }
	}

}
