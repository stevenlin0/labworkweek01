public class Vehicle {
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;


    // Constructor
    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }


    // Getters
    public int getNumberOfWheels() { return numberOfWheels; }
    public String getColor() { return color; }
    public float getEngineSize() { return engineSize; }
    public String getFuelType() { return fuelType; }


    // Setters
    public void setNumberOfWheels(int numberOfWheels) { this.numberOfWheels = numberOfWheels; }
    public void setColor(String color) { this.color = color; }
    public void setEngineSize(float engineSize) { this.engineSize = engineSize; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }


    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Number of wheels: " + numberOfWheels);
        System.out.println("Color: " + color);
        System.out.println("Engine size: " + engineSize + " liters");
        System.out.println("Fuel type: " + fuelType);
    }
}