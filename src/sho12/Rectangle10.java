package sho12;

/**
 * list12-10
 * アクセスメソッド
 */
public class Rectangle10 {
    private int width;
    private int height;

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

class NamedRectangle10 extends Rectangle10 {
    void goodMethod() {
        setSize(456, 78);
        System.out.println(getHeight());
    }
}
