package randomAndMath;

public class MathClass {
    public static void main(String[] args) {
        System.out.println("PI : " + Math.PI); // Gives the value of PI
        System.out.println("Euler Number : " + Math.E); // Gives the Euler number

        double result;

        result = Math.pow(2, 5); // Raises power of 5 on base 2
        System.out.println(".pow() : " + result); // 32.0 -> Double because the variable of result is double

        result = Math.abs(-5); // Makes negative value positive and leaves positive as it is
        System.out.println(".abs() : " + result); // 5.0 -> Double because the variable of result is double

        result = Math.sqrt(9); // Square root of the number passed
        System.out.println(".sqrt() : " + result); // 3.0 -> Double because the variable of result is double

        result = Math.round(3.14); // Round off's the number provided
        System.out.println(".round() : " + result); // 3.0 -> Double because the variable of result is double

        result = Math.ceil(3.14); // Round off's the number provided to the upper side
        System.out.println(".ceil() : " + result); // 4.0 -> Double because the variable of result is double

        result = Math.floor(3.99); // Round off's the number provided to the lower side
        System.out.println(".floor() : " + result); // 3.0 -> Double because the variable of result is double

        result = Math.max(10, 20); // Gives maximum number between the numbers passed
        System.out.println(".max() : " + result); // 20.0 -> Double because the variable of result is double

        result = Math.min(10, 20); // Gives minimum number between the numbers passed
        System.out.println(".min() : " + result); // 10.0 -> Double because the variable of result is double


    }
}
