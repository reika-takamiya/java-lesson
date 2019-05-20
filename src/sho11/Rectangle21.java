package sho11;

/**
 * 問題11-6　list11-21
 * 引数を一つにする
 *
 * <pre>{@code
 * class Rectangle21 {
 *     ・・・
 *     boolean areSame(Rectangle21 a, Rectangle b) {
 *         if (a ==null || b == null) {
 *             return false;
 *         } else if (a.width == b.width && a.height == b.height) {
 *             return true;
 *         } else {
 *             return false;
 *         }
 *     }
 * }
 * }
 * </pre>
 */
public class Rectangle21 {
    int width;
    int height;

    Rectangle21(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Rectangle21 rectangle) {
        if (rectangle == null) {
            return false;
        }
        return width == rectangle.width && height == rectangle.height;
    }
}
