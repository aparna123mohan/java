import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class builtinoperations {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        List<String> stringList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
       System.out.println("Name : APARNA MOHAN");
        System.out.println("Reg no : SJC 22MCA-2013");
        System.out.println("Course code : 20MCA132");
        System.out.println("Date : 27/6/2023");
        System.out.print("Enter the number of strings to add: ");
        int numStrings = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        // Add elements to the list based on user input
        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter string #" + (i + 1) + ": ");
            String input = scanner.nextLine();
            stringList.add(input);
        }

        // Display the elements in the list
        System.out.println("Original list: " + stringList);

        // Get the size of the list
        int size = stringList.size();
        System.out.println("Size of the list: " + size);

        // Check if the list is empty
        boolean isEmpty = stringList.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        // Access elements by index
        String firstElement = stringList.get(0);
        String lastElement = stringList.get(size - 1);
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Sort the list in ascending order
        Collections.sort(stringList);
        System.out.println("List after sorting in ascending order: " + stringList);

        // Check if an element exists in the list
        System.out.print("Enter a string to check if it exists in the list: ");
        String searchString = scanner.nextLine();
        boolean containsString = stringList.contains(searchString);
        System.out.println("Does the list contain '" + searchString + "'? " + containsString);

        // Remove an element from the list
        System.out.print("Enter a string to remove from the list: ");
        String removeString = scanner.nextLine();
        boolean removed = stringList.remove(removeString);
        System.out.println("Element '" + removeString + "' removed? " + removed);
        System.out.println("List after removing an element: " + stringList);

        // Clear the list
        stringList.clear();
        System.out.println("List after clearing all elements: " + stringList);

        scanner.close();
    }
}

