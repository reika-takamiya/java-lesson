package sho2;

/**
 * 下のプログラムを実行したところ10000000000ではなく410065408と表示されてしまった。
 * 10000000000と表示させるためのプログラムを作成する。
 *
 * public class CalcBig {
 *     public static void main(String[] args) {
 *         System.out.println(100000 * 100000);
 *     }
 * }
 *
 */
public class Mondai4 {
    public static void  main(String[] args) {
        System.out.println(100000L * 100000L);
    }
}
