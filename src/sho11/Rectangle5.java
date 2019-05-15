package sho11;

/**
 * list11-5
 * 引数なしのコンストラクタ
 */
public class Rectangle5 {
    int width;
    int height;

    public Rectangle5() {
        setSize(10, 20);
    }

    Rectangle5(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return this.width * this.height;
    }
}

