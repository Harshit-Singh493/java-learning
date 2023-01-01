import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        // .nextline() reads a string of characters including spaces if you don't want spaces use .next()
        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        // .nextInt() to read integers
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        // .nextDouble() to read double
        System.out.print("Enter your GPA : ");
        double gpa = sc.nextDouble();

        // .nextBoolean() to read boolean
        System.out.print("Are you a Student? (true/false) : ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You have a GPA of " + gpa);
        System.out.println("Student? : " + isStudent);
        sc.close();

    }
}
