package conditionals;

public class TernaryOp {
    public static void main(String[] args) {
        // Ternary operator ? -> Returns 1 of 2 values if a condition is true, it is a shorter version of if-else
        // variable = (condition) ? isTrue : isFalse;

        int score = 70;

        String passOrFail = (score >= 60) ? "Pass" : "Fail";

        System.out.println(passOrFail);

        int number  = 3;
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);
    }
}
