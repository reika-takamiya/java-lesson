package sho19;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * list19-11
 * LinkedListをキューとして用いたサンプル(add,element,remove)
 */
public class LinkedListTest3 {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Alice");
        System.out.println("add後のqueue = " + queue);
        queue.add("Bob");
        System.out.println("add後のqueue = " + queue);
        queue.add("Chirs");
        System.out.println("add後のqueue = " + queue);
        queue.add("Diana");
        System.out.println("add後のqueue = " + queue);

        try {
            while (true) {
                String name = queue.element();
                System.out.println("elementの戻り値 = " + name);
                name = queue.remove();
                System.out.println("removeの戻り値 = " + name);
                System.out.println("remove後queue = " + name);
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}
