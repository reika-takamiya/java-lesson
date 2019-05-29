package sho16;

/**
 * 問題16－10
 * 下のSingleThreadProgramクラスはjobというクラスのオブジェクトを10個作ってworkというメソッドを呼び続けるものである。
 * 現在はシングルスレッドのプログラムになっており、複数の仕事をfor文で実行している。このプログラムをマルチスレッドに書き換える。
 * クラスjobはどこかで宣言されているものとする。
 * <pre>{@code
 * public class SingleThreadProgram {
 *     job[] jobs;
 *
 *     public SingleThreadProgram(int jobcount) {
 *         jobs = new job[jobcount];
 *         for (int i = 0; i < jobcount; i++) {
 *             jobs[i].work();
 *         }
 *     }
 *
 *     public static void main(String[] args) {
 *         SingleThreadProgram self = new SingleThreadProgram(10);
 *         while (true) {
 *             self.workAllJobs();
 *         }
 *     }
 * }
 * }
 * </pre>
 */
public class JobThread extends Thread {
    Job job;

    public JobThread(int n) {
        job = new Job(n);
    }

    @Override
    public void run() {
        while (true) {
            job.work();
        }
    }
}
