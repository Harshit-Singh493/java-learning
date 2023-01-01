package conditionals;

public class EnhancedSwitch {
    public static void main(String[] args) {
        // Enhanced switch -> A replacement to many else-if statements (Java14 feature)

        String day = "Monday";

        switch (day) {
            // You can also comma-separate multiple cases if they give the same output
            // example = case "Saturday", "Sunday" -> System.out.println("It is a Weekend");
            case "Monday" -> System.out.println("It is a Weekday");
            case "Tuesday" -> System.out.println("It is a Weekday");
            case "Wednesday" -> System.out.println("It is a Weekday");
            case "Thursday" -> System.out.println("It is a Weekday");
            case "Friday" -> System.out.println("It is a Weekday");
            case "Saturday" -> System.out.println("It is a Weekend");
            case "Sunday" -> System.out.println("It is a Weekend");
            default -> System.out.println(day + " is not a day!");
        }

    }
}
