package arrays;

import java.util.Scanner;

public class DynamicSizeAllocationInAnArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of foods you want to insert : ");
        int n = sc.nextInt();
        sc.nextLine(); // This line is for clearing the "input buffer"
        // The "new" keyword created an array of size let's say three and initialize it by 0
        // [0, 0, 0]
        String[] food = new String[n];

        for (int i = 0; i < food.length; i++) {
            System.out.print("Enter your food name : ");
            food[i] = sc.nextLine();
        }

        for (int j = 0; j < food.length; j++) {
            System.out.printf("Food no. %d : %s\n", j + 1, food[j]);
        }
    }
}
