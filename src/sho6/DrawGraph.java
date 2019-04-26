package sho6;

/**
 * グラフの表示
 */
public class DrawGraph {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
