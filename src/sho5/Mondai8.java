package sho5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Drink2.javaを実行したとき、a,b,cのいずれも入力せずにリターンキーを押したところ下のようなエラーになった。
 * 防ぐためのプログラムを作成する。
 * <p>
 * C:\WORK> java Drink2
 * 飲み物は何が好きですか？
 * a オレンジジュース
 * b コーヒー
 * c どちらでもない
 * a,b,cのどれかを選んでください。
 * 　　←ここでリターンキー
 * Exception in thread "main" java.long StringIndexOutOfBoundsException:
 * String index out of range: 0
 * at java.long.String.charAt(String.java:658)
 * at Drink2.main(Drink2.java:13)
 */

public class Mondai8 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか？");
            System.out.println("a オレンジジュース");
            System.out.println("b コーヒー");
            System.out.println("c　どちらでもない");
            System.out.println("a,b,cのどれかを選んでください。");
            String line = reader.readLine();
            char alphabet;
            if (line.length() > 0) {
                alphabet = line.charAt(0);
            } else {
                alphabet = 'c';
            }
            switch (alphabet) {
                case 'a':
                    System.out.println("オレンジジュースです。");
                    break;

                case 'b':
                    System.out.println("コーヒーです。");
                    break;

                default:
                    System.out.println("どちらでもありません。");
                    break;

            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}


