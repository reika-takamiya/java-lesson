package sho5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 下のswitch文をif文で書き換える。
 *
 * <pre>{@code
 * switch (c) {
 * case '1':
 * case 'a':
 *     System.out.println("オレンジジュースです。");
 *     break;
 * case '2':
 * case 'b':
 *     System.out.println("コーヒーです。");
 *     break;
 * default:
 *     System.out.println("どちらでもありません。");
 *     break;
 * }</pre>
 */
public class Mondai5 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか？");
            System.out.println("1.オレンジジュース(a)");
            System.out.println("2.コーヒー(b)");
            System.out.println("1,2,のどちらかを選んでください(a,b,でも選べます)。");
            String line = reader.readLine();
            char userCharacterSelection = line.charAt(0);
            if (userCharacterSelection == '1' || userCharacterSelection == 'a') {
                System.out.println("オレンジジュースです。");
            } else if (userCharacterSelection == '2' || userCharacterSelection == 'b') {
                System.out.println("コーヒーです。");
            } else {
                System.out.println("どちらでもありません。");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
