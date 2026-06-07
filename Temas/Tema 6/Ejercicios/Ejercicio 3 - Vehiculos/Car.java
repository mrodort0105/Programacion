package ejercicio3;

public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String licensePlate, String brand, int year, FuelType fuelType, int numberOfDoors) {
        super(licensePlate, brand, year, fuelType);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateSpeed() {
        return 120.0;
    }

    @Override
    public String nextMaintenanceDate() {
        return "6 meses";
    }

    @Override
    public String toString() {
        return super.toString() + " - Puertas: " + numberOfDoors;
    }
}
