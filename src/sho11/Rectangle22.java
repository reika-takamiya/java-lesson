package sho11;

/**
 * 問題11－7
 * widthフィールドが123で、heightフィールドが45であるようなRectangleのインスタンスを表示したとき、
 * Rectangle(123,45) と表示されるようにするプログラム
 */
public class Rectangle22 {
    int width;
    int height;

    Rectangle22(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle(" + width + "," + height + ")";
    }

    public static void main(String[] args) {
        Rectangle22 rectangle = new Rectangle22(123, 45);
        System.out.println(rectangle);
    }
}
