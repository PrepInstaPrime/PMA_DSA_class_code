import java.util.*;
// queue
/*
 * 1. Enqueue=> insertion of element 
 * 2. Dequeue=> deletion of element 
 * 3. front=> first element 
 * 4. rear=> last element 
 * 5. peek()=> first element
 */
public class QueueExample {
    public static void main(String[] args) {
        // queue with the help of linked list
        // Queue<Integer> queue= new LinkedList<>();
        // Queue with the help of arrayDeque and this is faster than linkedlist method
        ArrayDeque<Integer> queue= new ArrayDeque<>();
        // insertion of value in queue using add method
        queue.add(1);
        queue.add(3);
        queue.add(5);
        queue.add(4);
        // we can also insert or add value in queue with the help of offer()
        queue.offer(6);
        System.out.println(queue);
        // peek is fron
        System.out.println(queue.peek());
        // remove element 
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println("After deletion");
        System.out.println(queue);
        // checking queue is empty or not
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        for(int val:queue){
            System.out.println(val);
        }
    }
}
