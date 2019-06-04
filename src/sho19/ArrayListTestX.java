package sho19;

import java.util.ArrayList;
import java.util.List;

/**
 * list19-8
 * ArrayListのサンプル
 */
public class ArrayListTestX {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chirs");
        list.add("Bob");
        list.add("Elmo");

        System.out.println("最初の要素= " + list.get(0));
        System.out.println("最後の要素" + list.get(list.size() - 1));

        for (String string : list) {
            System.out.println(string);
        }

        System.out.println("最初に出てくるBobの添え字 = " + list.indexOf("Bob"));
        System.out.println("最後に出てくるBobの添え字 = " + list.lastIndexOf("Bob"));
    }
}
