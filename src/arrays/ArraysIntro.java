package arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // Arrays -> A collection of values of the same data type
        // Think of it as a variable that can store more than 1 value



        String[] fruits = {"Apple", "Orange", "Banana", "Coconut"}; // All the values should be of same datatype (In this case String)
        // Each value in an array has an index value indicating its position
        // In the fruits variable "Apple" is at the 0th index, "Orange" at 1st and so on

        // We will get the memory address if we directly try to print the fruits variable since arrays are reference type
        System.out.println(fruits);

        // To access a value we need the index
        System.out.println(fruits[0]);

        // We can also replace an element by specifying the index
        fruits[0] = "Pineapple";
        System.out.println(fruits[0]); // Now at 0th position its "Pineapple" not "Apple"

        // To get the length of an Array
        System.out.println("Length of fruits array : " + fruits.length);

        // To print all the elements in an array we can use a for-loop
        // This loop will continue till "i" is not equal to the length of the array (4)
        // Meaning it will go till 3 -> 0 1 2 3
        for (int i = 0; i < fruits.length; i++) {
            System.out.printf("Value of fruits at %d position : %s\n", i, fruits[i]);
        }
        System.out.println();
        // To sort an array :
        // Arrays.sort(array name)
        // Since this is a String array it will sort alphabetically, for numbers it will be sorted in increasing order
        Arrays.sort(fruits);

        for (int i = 0; i < fruits.length; i++) {
            System.out.printf("Value of SORTED fruits at %d position : %s\n", i, fruits[i]);
        }

        // To fill every element in an array with a value we can use Arrays.fill
        // Arrays.fill(array name, the value to fill with)
        // Example -> Arrays.fill(fruits, "Peach")
        // This will replace every fruit name with peach
    }


}
