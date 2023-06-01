import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing amounts to the stack
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);

        // Removing the last amount from the stack
        int lastAmount = stack.pop();
        System.out.println("Removed amount: " + lastAmount);

        // Displaying the remaining amounts in the stack
        System.out.println("Stack: " + stack);
    }
}
