public class Car extends Vehicle {
    private String brand;


    // Constructor
    public Car(String brand, int numberOfWheels, String color, float engineSize, String fuelType) {
        super(numberOfWheels, color, engineSize, fuelType); // Call the Vehicle constructor
        this.brand = brand;
    }


    // Getter and Setter for brand
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }


    // Method to honk
    public void honk() {
        System.out.println("Honk, honk!");
    }


    // Override the displayInfo method to include brand
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
    }
}