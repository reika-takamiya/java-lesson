package sho8;

/**
 * 引数が2つのメソッド
 */
public class Power1 {
    public static void main(String[] args) {
        System.out.println(getPower(8, 2));
    }

    /**
     * xのn乗の計算
     *
     * @param number 累乗する数字
     * @param square 累乗する回数
     * @return 累乗した結果
     */
    public static int getPower(int number, int square) {
        int y = 1;
        for (int i = 0; i < square; i++) {
            y = y * number;
        }
        return y;
    }
}
