package logicalOp;

public class Logic {
    public static void main(String[] args) {
        // Logical operators allows us to check or modify more than one condition
        // && -> AND
        // || -> OR
        // ! -> NOT


        // 1. && -> All conditions MUST be true
        double temp = 20;
        if (temp <= 30 && temp >= 0) {
            // Here both temp <= 30 and temp >= 0 hold so this will be printed
            System.out.println("The weather is good");
        }

        // 2. ! -> it gives the opposite boolean value
        double temp2 = 20;
        boolean isSunny = false;
        if (temp2 <= 30 && temp2 >= 0 && !isSunny) {
            // Here we check if the isSunny is false
            System.out.println("The weather is good");
            System.out.println("The weather is not sunny");
        }

        // 3. || -> Similar to && operator but only one condition being true is mandatory
        double temp3 = -10;

        if (temp3 > 30 || temp3 < 0) {
            // Here only the condition temp < 0 holds true so it will still execute because we are using NOT operator
            System.out.println("The weather is bad");

        }



    }
}
