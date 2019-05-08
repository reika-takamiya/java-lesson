package sho5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 下のプログラムではif文を使っているが、これをswitch文を使うように変更する。
 *
 * <pre>{@code
 * import java.io.*;
 *
 * public class DrinkIf {
 *     public static void main(String[] args) {
 *         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 *         try{
 *             System.out.println("飲み物は何が好きですか？");
 *             System.out.println("あ＝オレンジジュース");
 *             System.out.println("い＝コーヒー");
 *             System.out.println("う＝どちらでもない");
 *             System.out.println("あ、い、う、のどれかを選んでください。");
 *             String line = reader.readLine();
 *             if (line.equals("あ")) {
 *                 System.out.println("オレンジジュースです。");
 *             } else if (line.equals("い")) {
 *                 System.out.println("コーヒーです。");
 *             } else {
 *                 System.out.println("どちらでもありません。");
 *             }
 *         }catch (IOException e) {
 *             System.out.println(e);
 *         }
 *     }
 * }
 * </pre>
 */
public class Mondai6 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか？");
            System.out.println("あ＝オレンジジュース");
            System.out.println("い＝コーヒー");
            System.out.println("う＝どちらでもない");
            System.out.println("あ、い、う、のどれかを選んでください。");
            String userKanaSelection = reader.readLine();
            switch (userKanaSelection) {
                case "あ":
                    System.out.println("オレンジジュースです。");
                    break;

                case "い":
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
