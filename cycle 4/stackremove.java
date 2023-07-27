import java.util.Stack;

public class stackremove {
    public static void removeElementAtPosition(Stack<String> stack, int position) {
        if (position >= 1 && position <= stack.size()) {
            Stack<String> tempStack = new Stack<>();

            // Remove elements from the original stack until the desired position is reached
            for (int i = 1; i < position; i++) {
                tempStack.push(stack.pop());
            }

            // Remove the element at the desired position
            stack.pop();

            // Restore the remaining elements back to the original stack
            while (!tempStack.isEmpty()) {
                stack.push(tempStack.pop());
            }

            System.out.println("Element at position " + position + " removed successfully.");
        } else {
            System.out.println("Invalid position. Please provide a valid position within the stack range.");
        }
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");
        stack.push("Element 4");
        stack.push("Element 5");

        int positionToRemove = 3;
         System.out.println("Name : APARNA MOHAN");
        System.out.println("Reg no : SJC 22MCA-2013");
        System.out.println("Course code : 20MCA132");
        System.out.println("Date : 27/6/2023");
        System.out.println("Before removal: " + stack);
        removeElementAtPosition(stack, positionToRemove);
        System.out.println("After removal: " + stack);
    }
}
