package sho4;

import java.io.*;

/**
 * 午前中(0時から11時)→「おはようございます」
 * 正午(12時)→「お昼です」
 * 午後(13時から18時)→「こんにちは」
 * 夜(19時から23時)→「時刻の範囲を超えています」
 * と、それぞれ表示するプログラムを作成。
 */
public class Mondai3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("現在の時刻を入力してください(「時」のみで結構です)。");
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            System.out.println("現在は" + n + "時です。");
            if (0 <= n && n <= 11) {
                System.out.println("おはようございます");
            } else if (n == 12) {
                System.out.println("お昼です。");
            } else if (13 <= n && n <= 18) {
                System.out.println("こんにちは。");
            } else if (19 <= n && n <= 23) {
                System.out.println("こんばんは。");
            } else {
                System.out.println("時刻の範囲を超えています");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数式が正しくありません。");
        }
    }
}
