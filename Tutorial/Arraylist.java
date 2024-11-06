package Tutorial;

import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Create a new array with a larger size
        int[] largerNumbers = new int[10];
        
        // Copy the original array into the new array
        System.arraycopy(numbers, 0, largerNumbers, 0, numbers.length);
        
        // Add new values
        largerNumbers[5] = 6;
        largerNumbers[6] = 7;
        largerNumbers[7] = 8;
        largerNumbers[8] = 9;
        largerNumbers[9] = 10;
        
        // Print the new array using Arrays.toString()
        System.out.println(Arrays.toString(largerNumbers));
    }
}
