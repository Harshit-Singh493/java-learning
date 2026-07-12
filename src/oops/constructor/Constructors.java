package oops.constructor;

public class Constructors {
    public static void main(String[] args) {
        // Constructor -> A special method to initialize objects, you can pass arguments to a constructor and set up initial values
        Students s1 = new Students("SpongeBob", 30, 3.8);
        Students s2 = new Students("Patrick", 34, 1.2);
        System.out.println(s1.name + " " + s1.age + " " + s1.gpa);
        System.out.println(s2.name + " " + s2.age + " " + s2.gpa);
        s1.study();
        s2.study();

    }
}