// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("A");
        stack.push("B");

        // Check if the stack is empty
        boolean empty = stack.isEmpty();
        System.out.println("Is the stack empty? " + empty); // This will print "Is the stack empty? false"

        // Pop elements from the stack
        stack.pop();
        stack.pop();

        // Check if the stack is empty again
        empty = stack.isEmpty();
        System.out.println("Is the stack empty? " + empty); // This will print "Is the stack empty? true"

    }
}