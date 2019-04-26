package sho5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String型でswitch文を使った例
 */
public class Drink4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか？");
            System.out.println("オレンジジュース(orange)");
            System.out.println("コーヒー(coffee)");
            System.out.println("どちらでもない(other)");
            System.out.println("orange,coffee,otherのどれかを選んでください。");
            String userCharacterSelection = reader.readLine();
            switch (userCharacterSelection) {
                case "orange":
                    System.out.println("オレンジジュースです。");
                    break;

                case "coffee":
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
