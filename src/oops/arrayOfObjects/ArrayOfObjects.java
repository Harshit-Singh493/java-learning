package oops.arrayOfObjects;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Car2 c1 = new Car2("Mustang", "Red");
        Car2 c2 = new Car2("Corvette", "Blue");
        Car2 c3 = new Car2("Charger", "Yellow");

        Car2[] cars = {c1, c2, c3};
        // Another way to instantiate the array of objects without giving unique identifier
        // Car2[] cars = {  new Car2("Mustang", "Red"),
        //                  new Car2("Corvette", "Blue"),
        //                  new Car2("Charger", "Yellow");
        //                }

        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }
    }
}
