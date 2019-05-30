package sho19;

import java.util.HashSet;
import java.util.Set;

/**
 * list19-13
 * HashSetのサンプル
 */
public class HashSetTest1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Alice");
        set.add("Bob");
        set.add("Chirs");
        set.add("Diana");
        set.add("Elmo");

        for (String name : set) {
            System.out.println(name);
        }
        if (set.contains("Alice")) {
            System.out.println("setにAliceは含まれています。");
        } else {
            System.out.println("setにAliceは含まれていません。");
        }
    }
}
