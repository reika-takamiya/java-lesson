package sho11;

/**
 *問題11－4
 *  コンパイルエラーを修正する。
 *
 * <pre>{@code
 * class Point{
 *     int x;
 *     int y;
 *     static void setPosition(int x,int y) {
 *         this.x = x;
 *         this.y = y;
 *     }
 * }
 * }
 * </pre>
 */
public class Point {
    int x;
    int y;

    void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
