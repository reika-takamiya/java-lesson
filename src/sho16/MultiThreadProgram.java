package sho16;

/**
 * 問題16－10
 * MultiThreadProgramクラス
 */
public class MultiThreadProgram {
    public MultiThreadProgram(int jobcount) {
        for (int i = 0; i < jobcount; i++) {
            new JobThread(i).start();
        }
    }

    public static void main(String[] args) {
        new MultiThreadProgram(10);
    }
}
