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
            String line = reader.readLine();
            char moji = line.charAt(0);
            if (moji == '1' || moji == 'a') {
                System.out.println("オレンジジュースです。");
            } else if (moji == '2' || moji == 'b') {
                System.out.println("コーヒーです。");
            } else {
                System.out.println("どちらでもありません。");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
