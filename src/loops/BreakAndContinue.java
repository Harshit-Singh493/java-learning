package loops;

public class BreakAndContinue {
    public static void main(String[] args) {
        // break -> Break out of a loop (STOP)
        // continue -> Skip current iteration of a loop (SKIP)

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; // Skips odd number
            }

            System.out.print(i + " ");
        }
    }
}
