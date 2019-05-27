package sho16;

/**
 * 問題16－3
 * 問題16‐2のLabelPrintを使って「おはよう！」「こんにちは！」「こんばんは！」を
 * それぞれ表示するスレッド3つを動かすクラスを宣言。
 */
public class PrintHello3 {
    public static void main(String[] args) {
        new LabelPrinter("おはよう！").start();
        new LabelPrinter("こんにちは！").start();
        new LabelPrinter("こんばんは！").start();
    }
}
