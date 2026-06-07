package ejercicio3;

public class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    public Motorcycle(String licensePlate, String brand, int year, FuelType fuelType, boolean hasSidecar) {
        super(licensePlate, brand, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateSpeed() {
        return 100.0;
    }

    @Override
    public String nextMaintenanceDate() {
        return "3 meses";
    }

    @Override
    public String toString() {
        return super.toString() + " - Sidecar: " + hasSidecar;
    }
}