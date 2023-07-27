import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Q18{
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
System.out.println("Name : APARNA MOHAN");
        System.out.println("Reg no : SJC 22MCA-2013");
        System.out.println("Course code : 20MCA132");
        System.out.println("Date : 27/6/2023");
        // Adding elements to the HashMap
        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        System.out.println("Enter the elements (key-value pairs):");
        for (int i = 0; i < numElements; i++) {
            String key = scanner.nextLine();
            int value = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            hashMap.put(key, value);
        }

        // Printing the initial HashMap
        System.out.println("Initial HashMap:");
        printMap(hashMap);

        // Converting HashMap to TreeMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);

        // Printing the final TreeMap
        System.out.println("Final TreeMap:");
        printMap(treeMap);

        scanner.close();
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();
    }
}

