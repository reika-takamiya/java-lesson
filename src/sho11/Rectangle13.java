package sho11;

/**
 * list11-13
 * getAreaをクラスメソッドとして書く
 */
public class Rectangle13 {
    int width;
    int height;

    Rectangle13(int width, int height) {
        this.width = width;
        this.height = height;
    }

    static int getArea(Rectangle obj) {
        return obj.width * obj.height;
    }
}
