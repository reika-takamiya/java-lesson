package sho15;

/**
 * list15-1
 * ガーベッジコレクションの動作確認をするプログラム
 */
public class GcTest1 {
    public static void main(String[] args) {
        while (true) {
            String string = new String("ABCEFGHIJKLMNOPQRSTUVVXYZ");
            System.out.println("残りメモリ = " + Runtime.getRuntime().freeMemory());
        }
    }
}
