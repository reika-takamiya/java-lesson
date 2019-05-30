package sho19;

import java.util.LinkedList;
import java.util.Queue;

/**
 * list19-10
 * LinkedListをキューとして用いたサンプル (offer,peek,pool)
 */
public class LinkedListTest2 {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Alice");
        System.out.println("offer後のqueue = " + queue);
        queue.offer("Bob");
        System.out.println("offer後のqueue = " + queue);
        queue.offer("Chirs");
        System.out.println("offer後のqueue = " + queue);
        queue.offer("Diana");
        System.out.println("offer後のqueue = " + queue);

        while (queue.peek() != null) {
            String name = queue.poll();
            System.out.println("pollの戻り値 =" + name);
            System.out.println("poll後のqueue =" + queue);
        }
    }
}
