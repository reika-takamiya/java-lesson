package sho11;

/**
 * list11-6
 * フィールドの初期化
 */
public class Rectangle6 {
    int width = 10;
    int height = 20;

    Rectangle6(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return width * height;
    }
}
