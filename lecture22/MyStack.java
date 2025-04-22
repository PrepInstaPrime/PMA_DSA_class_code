import java.util.Stack;
public class MyStack {
    public static void main(String args []){
        Stack<Integer> stack = new Stack<>();
        // inserting the values in stack
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack);
        // deleting value from stack
        int del=stack.pop();
        System.out.println("delete value: "+del+" and updated stack"+stack);
        // size of stack
        System.out.println("lenght of stack: "+stack.size());
        // check stack for empty
        System.out.println("is Empty: "+stack.isEmpty());
        // top value
        System.out.println("Peek value: "+stack.peek());

    }
}
