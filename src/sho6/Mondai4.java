package sho6;

/**
 * 1*1=1,1*2=2・・・9*9=81,となるような九九の表を作るグラフを作成。
 */
public class Mondai4 {
    public static void main(String[] args) {
        for (int number1 = 1; number1 < 10; number1++) {
            System.out.println(number1 + ":");
            for (int number2 = 1; number2 < 10; number2++) {
                System.out.println(number1 + "*" + number2 + "=" + number1 * number2 + ",");
            }
            System.out.println("");
        }
    }
}
