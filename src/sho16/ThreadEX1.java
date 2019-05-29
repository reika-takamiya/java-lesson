package sho16;

/**
 * 問題16‐6
 * 3秒ごとに"***"を10回ずつ表示するスレッドと5秒ごとに"====="を10回表示するスレッドをそれぞれ1つずつ動かすクラスを
 * Threadクラスの拡張クラスとして作成する。
 */
public class ThreadEX1 {
    public static void main(String[] args) {
        new ThreadAsterisk1().start();
        new ThreadEqual1().start();
    }
}
