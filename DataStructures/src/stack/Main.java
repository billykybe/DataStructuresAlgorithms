package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Billy");
        stack.push("Kibet");
        stack.push("Sandra");
        stack.push("Yegon");

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.search("Yegon"));


    }
}
