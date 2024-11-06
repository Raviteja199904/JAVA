import java.util.*;

public class LinkedListMethods{
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        

        // 1. Adding elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        System.out.println(linkedList);

        // 2. Adding an element at a specific index
        linkedList.add(1, "Mango");
        System.out.println( linkedList);
System.out.println(linkedList.get(2));
       

        // 4. Setting an element
        linkedList.set(2, "Orange");
        System.out.println("After setting index 2 to 'Orange': " + linkedList);

        // 5. Removing an element by index
        linkedList.remove(1);
        System.out.println("After removing element at index 1: " + linkedList);

        // 6. Removing an element by value
        linkedList.remove("Apple");
        System.out.println("After removing 'Apple': " + linkedList);

        // 7. Checking if the list contains a specific element
        boolean contains = linkedList.contains("Banana");
        System.out.println("List contains 'Banana': " + contains);

        // 8. Getting the size of the list
        int size = linkedList.size();
        System.out.println("Size of the list: " + size);

        // 9. Clearing the list
        linkedList.clear();
        System.out.println("After clearing the list: " + linkedList);

        // Deque Operations
        System.out.println("\nDeque Operations:");

        // 1. Adding elements to the front and back
        linkedList.addFirst("First");
        linkedList.addLast("Last");
        System.out.println("After addFirst() and addLast(): " + linkedList);

        // 2. Getting first and last elements
        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // 3. Removing first and last elements
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After removeFirst() and removeLast(): " + linkedList);

        // 4. Using offer methods (add at the front and back)
        linkedList.offer("Banana");
        linkedList.offerFirst("Apple");
        linkedList.offerLast("Cherry");
        System.out.println("After offerFirst() and offerLast(): " + linkedList);

        // 5. Using poll methods (retrieve and remove the first/last element)
        linkedList.pollFirst();
        linkedList.pollLast();
        System.out.println("After pollFirst() and pollLast(): " + linkedList);

        // 6. Peeking (retrieving without removing)
        String peekFirst = linkedList.peekFirst();
        String peekLast = linkedList.peekLast();
        System.out.println("First element after peek: " + peekFirst);
        System.out.println("Last element after peek: " + peekLast);

        // Queue Operations
        System.out.println("\nQueue Operations:");

        // 1. Using offer() to add element at the end
        linkedList.offer("Date");
        linkedList.offer("Fig");
        System.out.println("After offer() (Queue operations): " + linkedList);

        // 2. Using element() to get the first element
        String element = linkedList.element();
        System.out.println("First element using element(): " + element);

        // 3. Using remove() to remove the first element
        linkedList.remove();
        System.out.println("After remove() (Queue operation): " + linkedList);

        // Other Operations
        System.out.println("\nOther Operations:");

        // 1. Using clone() to create a shallow copy
        LinkedList<String> clonedList = (LinkedList<String>) linkedList.clone();
        System.out.println("Cloned list: " + clonedList);

        // 2. Using isEmpty() to check if the list is empty
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is the list empty: " + isEmpty);

        // 3. Using descendingIterator() to iterate in reverse order
        System.out.println("Iterating in reverse order:");
        Iterator<String> descIterator = linkedList.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }

        // 4. Using indexOf() to find the index of an element
        int index = linkedList.indexOf("Fig");
        System.out.println("Index of 'Fig': " + index);

        // 5. Using toArray() to convert the list to an array
        Object[] array = linkedList.toArray();
        System.out.println("Array from LinkedList: " + Arrays.toString(array));
    }
}
