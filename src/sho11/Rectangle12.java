package sho11;

/**
 * list11-12
 * getAreaをインスタンスメソッドとして書く
 */
public class Rectangle12 {
    int width;
    int height;

    Rectangle12(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return this.width * this.height;
    }
}
