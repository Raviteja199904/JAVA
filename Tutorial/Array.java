package Tutorial;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        // Modifying elements
        numbers.set(1, 20); // Changes the second element to 20

        // Removing an element
        numbers.remove(2); // Removes the third element

        // Output the ArrayList
        System.out.println(numbers); // Prints [1, 20]
    }
}
