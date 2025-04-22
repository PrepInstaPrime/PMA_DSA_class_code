// reverse the elements in queue
// forexample: inp: [1,2,3]
// output: [3,2,1]

import java.util.ArrayDeque;
import java.util.Stack;

public class Practice1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue= new ArrayDeque<>();
        Stack<Integer> stack= new Stack<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("before reversing the array: "+ queue);
        while(!queue.isEmpty()){
             stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        System.out.println("after reversing:"+ queue);
    }
}
