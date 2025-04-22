import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> queue= new LinkedList<>();
        queue.add(1);
        queue.add(3);
        queue.add(6);
        queue.addFirst(7);
        System.out.println(queue);
        System.out.println(queue.removeLast());
        System.out.println(queue);

    }
}
