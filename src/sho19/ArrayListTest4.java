package sho19;

import java.util.ArrayList;

/**
 * list19-5
 * イテレータが隠された拡張forループ
 */
public class ArrayListTest4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chirs");
        list.add("diana");
        list.add("Elmo");

        for (String name : list) {
            System.out.println(name);
        }
    }
}
