package loops;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Banana", "Coconut"};

        // Better way to loop through this instead of traditional for-loop is by using Enhanced for loop
        // Also known as for-Each loop
        for (String f : fruits) {
            System.out.println(f);
        }
    }
}
