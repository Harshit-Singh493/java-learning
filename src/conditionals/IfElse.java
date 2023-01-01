

public class IfElse {
    public static void main(String[] args) {

        // if Statement -> Performs a block of code if it's condition is true
        // else if statement -> if the condition in if statement doesn't satisfy (optional)
        // else statement -> if the condition in if and all the else-if doesn't satisfy then the code in else will run (optional)

        // Check age
        int age = -12;
        if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age <= 0) {
            System.out.println("You haven't been born yet!");
        }else {
            System.out.println("You are a child!");
        }
    }
}
