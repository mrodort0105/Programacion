package ejercicio3;

public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Car("1234ABC", "Toyota", 2020, FuelType.GASOLINE, 5);
        Vehicle v2 = new Motorcycle("5678DEF", "Yamaha", 2022, FuelType.DIESEL, false);

        System.out.println(v1);
        System.out.println("Velocidad: " + v1.calculateSpeed());
        System.out.println("Mantenimiento: " + v1.nextMaintenanceDate());

        System.out.println();

        System.out.println(v2);
        System.out.println("Velocidad: " + v2.calculateSpeed());
        System.out.println("Mantenimiento: " + v2.nextMaintenanceDate());

        System.out.println();
        System.out.println("Total vehiculos: " + Vehicle.getTotalVehicles());
    }
}
