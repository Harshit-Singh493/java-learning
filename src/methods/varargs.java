package methods;

public class varargs {
    public static void main(String[] args) {
        // varArgs -> Allows a method to accept a varying no. of arguments
        // Makes methods more flexible, no need for overloaded methods
        // Java will pack the arguments into an array
        // ... (Ellipsis)

        System.out.println(add(1, 2, 3, 4));
    }

    static int add(int... numbers) {
        int sum = 0;
        for (int EachNum : numbers) {
            sum += EachNum;
        }

        return sum;
    }
}
