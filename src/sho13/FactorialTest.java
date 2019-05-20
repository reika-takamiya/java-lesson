package sho13;

import java.io.IOException;

/**
 * 問題13－４
 * 下のプログラムの誤りを直す
 *
 * <pre>{@code
 * public class FactorialTest {
 *     public static void main(String[] args) {
 *         System.out.println(factorial (10));
 *     }
 *     public static int factorial(int n) {
 *         return n * factorial(n -1);
 *     }
 * }
 * }
 * </pre>
 */
public class FactorialTest {
    public static void main(String[] args) {
        try {
            System.out.println(factorial(10));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int factorial(int n) throws Exception {

        if (n > 0) {
            return n * factorial(n - 1);
        } else if (n == 0) {
            return 1;
        } else {
            throw new Exception("負の値は指定できません。");
        }
    }
}
