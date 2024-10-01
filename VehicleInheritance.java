class Vehicle {
    String model;
    int year;
    String color;

    Vehicle(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void displayDetails() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}

// Car subclass inheriting from Vehicle
class Car extends Vehicle {
    int numberOfDoors;

    Car(String model, int year, String color, int numberOfDoors) {
        super(model, year, color);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Motorcycle subclass inheriting from Vehicle
class Motorcycle extends Vehicle {
    int engineCapacity;

    Motorcycle(String model, int year, String color, int engineCapacity) {
        super(model, year, color);
        this.engineCapacity = engineCapacity;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
    }
}

// Truck subclass inheriting from Vehicle
class Truck extends Vehicle {
    double loadCapacity;

    Truck(String model, int year, String color, double loadCapacity) {
        super(model, year, color);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Main class to test the program
public class VehicleInheritance {
    public static void main(String[] args) {
        Car car = new Car("Honda Civic", 2000, "white", 4);
        Motorcycle motorcycle = new Motorcycle("125", 18, "Black", 400);
        Truck truck = new Truck("Ford F-150", 2020, "Black", 5.0);

        car.displayDetails();
        motorcycle.displayDetails();
        truck.displayDetails();
    }
}
