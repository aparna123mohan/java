import java.util.Arrays;
import java.util.Scanner;

public class bubblesort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Name : APARNA MOHAN");
        System.out.println("Reg no : SJC 22MCA-2013");
        System.out.println("Course code : 20MCA132");
        System.out.println("Date : 27/6/2023");
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter 'A' for ascending order or 'D' for descending order: ");
        String order = scanner.next().toUpperCase();
        
        System.out.println("Before sorting: " + Arrays.toString(array));
        
        if (order.equals("A")) {
            bubbleSortAscending(array);
            System.out.println("After sorting in ascending order: " + Arrays.toString(array));
        } else if (order.equals("D")) {
            bubbleSortDescending(array);
            System.out.println("After sorting in descending order: " + Arrays.toString(array));
        } else {
            System.out.println("Invalid choice. Please enter 'A' or 'D' for the order.");
        }
        
        scanner.close();
    }
    
    public static void bubbleSortAscending(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    public static void bubbleSortDescending(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

