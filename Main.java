public class Main {
    public static void main(String[] args) {
        // Test Vehicle
        Vehicle vehicle = new Vehicle(4, "Red", 1.8f, "Gasoline");
        vehicle.displayInfo();


        // Test Car
        Car car = new Car("Toyota", 4, "Blue", 2.5f, "Diesel");
        car.honk();
        car.displayInfo();
    }
}