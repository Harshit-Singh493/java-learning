package arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // 2D Array -> An array where each element is an array
        // Useful for storing a matrix of data

        // Here the grocery array is an 2D Array having arrays at each index
        String[][] grocery = {{"Apple", "Orange", "Banana"},
                             {"Potato", "Onion", "Carrot"},
                             {"Pepsi", "Tea", "Coffee"}};

        for (String[] food : grocery) {
            for (String eachFood : food) {
                System.out.print(eachFood + " ");
            }
            System.out.println();
        }

        // To access or modify an element at an index
        System.out.println("Before changing [0][0] : " + grocery[0][0]);
        grocery[0][0] = "Mango";
        System.out.println("After changing [0][0] : " +grocery[0][0]);
    }
}
