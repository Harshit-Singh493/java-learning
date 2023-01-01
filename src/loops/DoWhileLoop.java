package loops;
import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        // Do-while is does the task firsts then checks the condition (runs atleast once)
        Scanner sc = new Scanner(System.in);
        int age = 0;
        do {
            System.out.println("age cannot be negative");
            System.out.print("Enter your age : ");
            age = sc.nextInt();
        } while (age < 0);

        System.out.println("You are " + age + " years old");
        sc.close();
    }
}
