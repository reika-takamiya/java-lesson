package sho19;

import java.util.ArrayList;

/**
 * list19-2
 * list19-1と同じ処理をArrayListを使って表現する
 */
public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Alice");
        list.add("Bob");
        list.add("Chirs");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
