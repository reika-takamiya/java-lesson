package sho7;

/**
 * 下のプログラムをwhile文で書き直す。
 * <pre>{@code
 * public class Graph1 {
 *     public static void main(String[] args) {
 *         for (int i = 0; i < 10; i++) {
 *             for (int j = o; j < i * i; j++) {
 *                 System.out.println("*");
 *             }
 *             System.out.println("");
 *         }
 *     }
 * }
 * }</pre>
 */
public class Mondai2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            int j = 0;
            while (j < i * i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
