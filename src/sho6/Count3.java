package sho6;

/**
 * 2乗と3乗の計算
 */
public class Count3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            double resultOfPower1 = Math.pow(i, 2);
            double resultOfPower2 = Math.pow(i, 3);
            System.out.println(i + "の2乗は" + resultOfPower1 + "で、");
            System.out.println("3乗は" + resultOfPower2 + "です。");
            System.out.println("end");
        }
    }
}
