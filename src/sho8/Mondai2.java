package sho8;

/**
 * list8-3(Graph1.java)で宣言したメソッドprintGraphを使って、「*」で放物線を書くプログラムを作成
 */
public class Mondai2 {
    public static void main(String[] args) {
        for (int n = -8; n <= 8; n++) {
            printGraph(n * n);
        }
    }
    public static void printGraph(int squareResult) {
        int i;
        for (i = 0; i < squareResult; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}

