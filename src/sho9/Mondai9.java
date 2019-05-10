package sho9;

/**
 * 二次元配列の内容を表示するプログラム
 */
public class Mondai9 {
    public static void main(String[] args) {
        int[][] array = {
                {3, 1, 4, 1},
                {5, 9, 2},
                {6, 5},
                {3},
        };
        printArray(array);
    }

    public static void printArray(int[][] array) {
        System.out.println("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("  {");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ",");
            }
            System.out.println("},");
        }
        System.out.println("}");
    }
}
