package sho16;

/**
 * list16-7
 * 外からスレッドを終了させる
 */
public class Runner extends Thread {
    private boolean running = true;

    public void stopRunning() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            doCommand();
        }
    }

    public void doCommand() {
        System.out.println("aaa");
    }

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.start();
        runner.stopRunning();
    }
}

