package sho16;

/**
 * 問題16－7
 * 問題16‐6のクラスをRunnableインタフェースを実装して作成する。
 */
public class ThreadEX2 {
    public static void main(String[] args) {
        ThreadAsterisk2 asterisk2 = new ThreadAsterisk2();
        Thread thread = new Thread(asterisk2);
        thread.start();
        ThreadEqual2 equal2 = new ThreadEqual2();
        Thread thread2 = new Thread(equal2);
        thread2.start();
    }
}
