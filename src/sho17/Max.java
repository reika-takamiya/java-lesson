package sho17;

import static java.lang.System.out;
import static java.lang.Math.max;

/**
 * list17-11
 * java.lang.Math.maxをスタティックにimportした例
 */
public class Max {
    public static void main(String[] args) {
        int x = 45;
        int y = 100;
        int z = max(x, y);
        out.println("z = " + z);
    }
}
