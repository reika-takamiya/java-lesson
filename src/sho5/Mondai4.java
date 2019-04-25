package sho5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Drink1.javaを修正して、1なら「オレンジジュースです。」、
 * ２なら「コーヒーです。」、３なら「ミルクです。」、
 * それ以外なら「どれでもありません」となるようなプログラムを作成。
 */
public class Mondai4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物はなにがすきですか？");
            System.out.println("1 オレンジジュース");
            System.out.println("2 コーヒー");
            System.out.println("3 ミルク");
            System.out.println("4 どちらでもない");
            System.out.println("1,2,3,4のどれかを選んでください。");
            String line = reader.readLine();
            int number = Integer.parseInt(line);
            switch (number) {
                case 1:
                    System.out.println("オレンジジュースです。");
                    break;

                case 2:
                    System.out.println("コーヒーです。");
                    break;

                case 3:
                    System.out.println("ミルクです。");
                    break;

                default:
                    System.out.println("どれでもありません。");
                    break;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }
}
