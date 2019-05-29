package sho16;

/**
 * 問題16‐6
 * ThreadAsterisk1クラス
 */
public class ThreadAsterisk1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            System.out.println("***");
        }
    }
}
