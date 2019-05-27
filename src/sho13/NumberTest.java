package sho13;

/**
 *
 * list13-4
 * 整数値に変換できない文字列が渡されたときに例外が投げられるプログラム
 */
public class NumberTest {
    public static void main(String[] args) {
        try {
            String numberString = "xyz";
            int value = Integer.parseInt(numberString);
            System.out.println("value = " + value);
        } catch (NumberFormatException e) {
            System.out.println("例外:" + e);
        }
    }
}
