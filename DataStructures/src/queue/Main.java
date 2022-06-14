package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue =  new LinkedList<String>();
        System.out.println(queue.isEmpty());
        queue.add("Billy");
        queue.add("Kibet");
        queue.add("Sandra");
        System.out.println(queue.peek());
        System.out.println(queue);
        queue.remove();

        queue.offer("Carren");
        queue.offer("Sande");
        System.out.println(queue.peek());


        System.out.println(queue);
queue.poll();
        System.out.println(queue);
        System.out.println(queue.isEmpty());

        System.out.println(queue.contains("Carren"));
    }
}
