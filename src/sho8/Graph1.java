package sho8;

/**
 * 1本だけのグラフ表示
 */
public class Graph1 {
    public static void main(String[] args) {
        printGraph(10);
    }
    public static void printGraph(int line) {
        for (int i = 0; i < line; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
