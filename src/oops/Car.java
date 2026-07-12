package oops;

public class Car {
    // These variable are called as "Attributes"
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("You started the car!");
    }

    void stop() {
        isRunning = false;
        System.out.println("You stopped the car!");
    }
}
