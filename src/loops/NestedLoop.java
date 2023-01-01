package loops;

public class NestedLoop {
    public static void main(String[] args) {
        // Nested loop -> A loop inside another loop, used more often with matrices or DSA

        for (int i = 0; i <= 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            for (int j = 6; j > i; j--) {
                System.out.print("  ");
            }

            System.out.println();
        }

    }
}
