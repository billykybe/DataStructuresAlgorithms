package queue.priority;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> numbers = new PriorityQueue<>();

        numbers.offer("Billy");
        numbers.offer("AKibet");
        numbers.offer("DHello");
        numbers.offer("CYego");


        while (!numbers.isEmpty()){
            System.out.println(numbers.poll());
        }
    }
}
