import java.util.PriorityQueue;
import java.util.Scanner;

public class priorityQueue{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an empty priority queue
        PriorityQueue<Integer> queue = new PriorityQueue<>();
         System.out.println("Name : APARNA MOHAN");
        System.out.println("Reg no : SJC 22MCA-2013");
        System.out.println("Course code : 20MCA132");
        System.out.println("Date : 27/6/2023");

        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();

        // Prompt the user to enter elements and add them to the queue
        System.out.println("Enter the elements:");
        for (int i = 0; i < numElements; i++) {
            int element = scanner.nextInt();
            queue.offer(element);
        }

        System.out.println("Queue elements:");
        
        // Print and remove elements from the queue until it becomes empty
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        scanner.close();
    }
}

