package loops;

public class WhileLoop {
    public static void main(String[] args) {
        // while loop -> Repeat some code forever while some condition remains true
        int i = 0;

        while (i <= 10) {
            // This code will keep running till my 'i' not greater than 10
            System.out.print(i + " ");
            i++; // if we don't increment here it will cause an infinite loop
        }
    }
}
