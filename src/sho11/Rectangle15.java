package sho11;

/**
 * list11-15
 * finalをフィールド宣言に付ける
 */
public class Rectangle15 {
    final int INITIAL_WIDTH = 10;
    final int INITIAL_HEIGHT = 20;
    int width;
    int height;

    Rectangle15() {
        width = INITIAL_WIDTH;
        height = INITIAL_HEIGHT;
    }

    int getArea() {
        return width * height;
    }
}
