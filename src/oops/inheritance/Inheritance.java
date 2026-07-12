package oops.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        // Inheritance -> One class inherits the attributes and methods from another class.
        // Cat and Dog <- Animal and Plant <- Organism
        // Here Cat and Dog are not related also Animal and Plant class is also not related

        Dog d = new Dog();
        Cat c = new Cat();
        Plant p = new Plant();
        System.out.println(d.isAlive + " " + d.lives);
        System.out.println(c.isAlive + " " + c.lives);
        System.out.println(p.isAlive);
        p.photosynthesize();
        d.speak();
        c.speak();

    }
}
