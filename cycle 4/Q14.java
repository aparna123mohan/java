import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name : APARNA MOHAN");
        System.out.println("Reg no : SJC 22MCA-2013");
        System.out.println("Course code : 20MCA132");
        System.out.println("Date : 27/6/2023");
        while (true) {
            System.out.println("1. Add element at the front");
            System.out.println("2. Add element at the end");
            System.out.println("3. Remove element from the front");
            System.out.println("4. Remove element from the end");
            System.out.println("5. Print elements in the deque");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add at the front: ");
                    int elementFront = scanner.nextInt();
                    deque.addFirst(elementFront);
                    System.out.println("Element added at the front.");
                    break;
                case 2:
                    System.out.print("Enter the element to add at the end: ");
                    int elementEnd = scanner.nextInt();
                    deque.addLast(elementEnd);
                    System.out.println("Element added at the end.");
                    break;
                case 3:
                    if (!deque.isEmpty()) {
                        int removedFront = deque.removeFirst();
                        System.out.println("Element removed from the front: " + removedFront);
                    } else {
                        System.out.println("Deque is empty. No element to remove from the front.");
                    }
                    break;
                case 4:
                    if (!deque.isEmpty()) {
                        int removedEnd = deque.removeLast();
                        System.out.println("Element removed from the end: " + removedEnd);
                    } else {
                        System.out.println("Deque is empty. No element to remove from the end.");
                    }
                    break;
                case 5:
                    System.out.println("Elements in the deque:");
                    for (int element : deque) {
                        System.out.println(element);
                    }
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

