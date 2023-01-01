package methods;

public class MethodIntro {

    public static void main(String[] args) {
        // Method -> A block of reusable of code that is executed when called ()
        String name = "Harshit";
        int age = 19;
        happyBirthday(name, age);
        System.out.println(square(3));
    }
    static void happyBirthday(String name, int age) {

        // Here I can not directly access the name and age variables defined in main method
        // though we can get these variables as an argument
        System.out.printf("Happy birthday %s you are now %d years old\n", name, age);
    }

    static double square(double n) {
        return n * n;
    }

}
