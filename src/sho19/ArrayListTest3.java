package sho19;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * list19-4
 * イテレータを使ったサンプル
 */
public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chirs");
        list.add("diana");
        list.add("Elmo");

        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
