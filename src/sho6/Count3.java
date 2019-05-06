package sho6;

/**
 * 2乗と3乗の計算
 */
public class Count3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            double squareResult = Math.pow(i, 2);
            double cubeResult = Math.pow(i, 3);
            System.out.print(i + "の2乗は" + (int)squareResult + "で、");
            System.out.println("3乗は" + (int)cubeResult + "です。");
        }
        System.out.println("end");
    }
}
