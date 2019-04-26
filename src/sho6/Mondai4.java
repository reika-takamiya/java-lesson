package sho6;

/**
 * 1*1=1,1*2=2・・・9*9=81,となるような九九の表を作るグラフを作成。
 */
public class Mondai4 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i + ":");
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + i * j + ",");
            }
            System.out.println("");
        }
    }
}
