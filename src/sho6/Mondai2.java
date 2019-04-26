package sho6;

/**
 * Count3.javaと、DrawGraph1.javaを参考にして0～9の2乗のグラフを書くプログラムを作成。
 */
public class Mondai2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":");
            for (int j = 0; j < i * i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
