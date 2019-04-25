package sho6;

/**
 * Count3.javaと、DrawGraph1.javaを参考にして0～9の2乗のグラフを書くプログラムを作成。
 */
public class Mondai2 {
    public static void main(String[] args) {
        for (int number1 = 0; number1 < 10; number1++) {
            System.out.println(number1 + ":");
            for (int number2 = 0; number2 < number1 * number1; number2++) {
                System.out.println("*");
            }
            System.out.println("");
        }
    }
}
