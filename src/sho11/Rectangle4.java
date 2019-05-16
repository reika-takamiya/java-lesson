package sho11;

/**
 * list11-4
 * コンストラクタの中からメソッドを呼び出す
 */
public class Rectangle4 {
    int width;
    int height;

    public Rectangle4(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        width = width;
        height = height;
    }

    int getArea() {
        return this.width * this.height;
    }
}
