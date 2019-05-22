package sho15;

import java.util.ArrayList;

/**
 * list15-3
 * ガーベッジコレクションが動いてもメモリが回収されないプログラム
 */
public class GcArray2 {
    static ArrayList<int[]> list = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            int[] array = new int[1000];
            for (int i = 0; i < array.length; i++) {
            }
            list.add(array);
            System.out.println("残りメモリ = " + Runtime.getRuntime().freeMemory());
        }
    }
}
