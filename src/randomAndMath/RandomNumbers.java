package randomAndMath;
import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();

        // Generating random integers
        int number;
        number = rand.nextInt(1, 7); // Random number between 1 and 7 (exclusive of 7)
        System.out.println(number);

        // Generating random doubles
        double number2;
        number2 = rand.nextDouble();
        System.out.println(number2); // Gives a random between 0 and 1

        // We also have a .nextBoolean(), it gives true or false randomly

    }
}
