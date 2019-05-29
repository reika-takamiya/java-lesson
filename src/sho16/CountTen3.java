package sho16;

/**
 * 問題16－5
 * CountTenA.javaを参考にして、新たなスレッドを3個生成して動作するようにプログラムを書き換える。
 * また、java.lang.Threadクラスを利用して表示を行っているのがどのスレッドであるか分かるようにする。
 * <pre>{@code
 * public final String getName()
 * }</pre>
 */
public class CountTen3 extends Thread {
    public static void main(String[] args) {
        for (int th = 0; th < 3; th++) {
            new CountTen3().start();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("main:i = " + i + " by " + currentThread().getName());
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("run:i = " + i + " by " + getName());
        }
    }
}
