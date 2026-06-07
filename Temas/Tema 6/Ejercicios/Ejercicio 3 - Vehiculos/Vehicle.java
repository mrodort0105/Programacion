package ejercicio3;

public abstract class Vehicle implements Maintenance {

    private String licensePlate;
    private String brand;
    private int year;
    private FuelType fuelType;

    private static int vehicleCount = 0;

    public Vehicle(String licensePlate, String brand, int year, FuelType fuelType) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.year = year;
        this.fuelType = fuelType;
        vehicleCount++;
    }
   
    // Métodos abstractos
    public abstract double calculateSpeed();
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;	// == Compara referencias
        else if (this.licensePlate.equals(((Vehicle)obj).licensePlate)) // .equals compara contenido
        	return true;
        else {
        	return false;
        }
    }

    @Override
    public String toString() {
        return getVehicleInfo();
    }

    // Getters y setters
    public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	public static int getTotalVehicles() {
	    return vehicleCount;
	}

	public static void setVehicleCount(int vehicleCount) {
		Vehicle.vehicleCount = vehicleCount;
	}

	public String getVehicleInfo() {
        return brand + " - " + licensePlate + " - " + year + " - " + fuelType;
    }

}
