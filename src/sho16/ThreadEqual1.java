package sho16;

/**
 * 問題16‐6
 * ThreadEqual1クラス
 */
public class ThreadEqual1 extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            System.out.println("=====");
        }
    }
}

