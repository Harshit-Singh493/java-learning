package oops.methodOverriding;

public class Fish extends Animal{


    // Our fish class IS inheriting the move method from Animal, but we are overriding it
    @Override
    void move() {
        System.out.println("This animal is swimming");
    }
}
