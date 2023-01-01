package methods;

public class OverloadMethods {
    public static void main(String[] args) {
        // Overload Methods -> Methods that share the same name, but different parameter (Unique Signature)
        //                     signature = name + parameter, No two methods can have the same signature
        System.out.println(add(3 ,3));
        System.out.println(add(3.0, 3.0, 3.0));
    }


    // Signature1 -> add(int, int)
    static int add(int a, int b) {
        return a + b;
    }

    // Signature2 -> add(double, double, double)
    static double add(double a, double b, double c) {
        return a + b + c;
    }

    // SINCE Signature1 and Signature2 ARE DIFFERENT HENCE WE CAN OVERLOAD THESE TWO METHODS
}

