import java.util.ArrayList;

public class Arraylistexample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Accessing elements
        System.out.println("Element at index 0: " + numbers.get(0)); // Output: 10

        // Updating an element
        numbers.set(1, 50);
        System.out.println("Updated element at index 1: " + numbers.get(1)); // Output: 50

        // Removing an element
        numbers.remove(2);
        System.out.println("ArrayList after removing element at index 2: " + numbers); // Output: [10, 50]
        
        // Size of the ArrayList
        System.out.println("Size of the ArrayList: " + numbers.size()); // Output: 2
        
        // Checking if the ArrayList is empty
        System.out.println("Is the ArrayList empty? " + numbers.isEmpty()); // Output: false
        
        // Iterating over the elements using a for-each loop
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}