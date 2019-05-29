package sho17;

import static java.lang.System.*;
import static java.lang.Math.*;

/**
 * list17-12
 * スタティック・インポート・オン・デマンド宣言の例
 */
public class Math2 {
    public static void main(String[] args) {
        int x = 45;
        int y = 100;
        int z = max(x, y);
        out.println("z = " + z);
        out.println("π = " + PI);
    }
}
