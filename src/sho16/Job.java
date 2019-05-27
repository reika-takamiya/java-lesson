package sho16;

/**
 * 問題16－10
 * ダミーのJob
 */
public class Job {
    int num;

    public Job(int n) {
        num = n;
    }

    public void work() {
        System.out.println(this + "is working.");
        try {
            int n = (int) (Math.random() * 10000);
            Thread.sleep(n);
        } catch (InterruptedException e) {
        }
    }

    public String toString() {
        return "[Job" + num + "]";
    }
}
