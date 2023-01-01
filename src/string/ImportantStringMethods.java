package string;

public class ImportantStringMethods {
    public static void main(String[] args) {
        // Declaration and assignment of a string
        String name = "Harshit Singh";

        // To get the length of a String
        int length = name.length();
        System.out.printf("The Length of your name is %d \n", length);

        // To get the Character at a specific index in a String
        char letter = name.charAt(0);
        System.out.printf("at 0th position the character is %c in the String \n", letter);

        // Find the first occurrence index of a specified character in a string
        int index = name.indexOf("r");
        System.out.println("The index of 'r' in name is " + index);

        // Find the last occurrence index of a specified character in a string
        int lastIndex = name.lastIndexOf("i");
        System.out.println("The index of 'i' in name is " + lastIndex);

        // Convert all the character in String to Uppercase or lowercase
        //name = name.toUpperCase();
        //System.out.println(name);

        // = name.toLowerCase();
        //.out.println(name);

        // To trim the whitespaces in starting or ending of string
        // ex. name -> "    Harshit    "
        // name = name.trim() will remove the trailing spaces and gives the output as "Harshit"

        // Replace a particular character with other in a String
        name = name.replace("i", "z");
        System.out.println(name); // Output : Harshzt Szngh

        // These Methods return boolean

        // .isEmpty() checks if the string is empty or not, if it is then it return true else false
        // .contains(pass a character to check) checks if a string has that particular char or not, if it has then it return true else false
        // .equals(pass a string to compare) check if the passed string is same as original, returns true if it is else false, it doesn't account for case-sensitivity
        // .equalsIgnoreCase(pass a string to compare) works the same as .equals() but account's for case-sensitivity

        // SUBSTRINGS
        // .substring() is a method used to extract a portion of a string, ex. .substring(start, end)
        String email = "harshitexample@gmail.com";
        String username = email.substring(0, 14); // 14 is exclusive, to make this more flexible we can use .indexOf("@")
        String domain = email.substring(15);
        System.out.println("Your username which is extracted from email is " + username);
        System.out.println("Your domail which is extracted from email is " + domain);
    }
}
