package oops;

public class oopsIntro {
    public static void main(String[] args) {
        // Object -> An entity that holds data (attributes) and can perform actions (methods)
        // It's a reference data type

        // Class -> It's a blueprint used for objects

        // Creating an object
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car1.make + " " + car1.model + " " + car1.price);
        car2.price = 60000.99;
        System.out.println(car2.model + " " + car2.price);
        System.out.println(car1.isRunning);
        car1.start();
        System.out.println(car1.isRunning);
    }


}


