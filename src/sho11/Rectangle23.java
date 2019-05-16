package sho11;

/**
 * 問題11－8
 * Rectangle7.javaをもとにwidthとheightがマイナスになるなら強制的に0にしてしまうように修正する。
 */
public class Rectangle23 {
    int width;
    int height;

    Rectangle23() {
        setSize(10, 20);
    }

    Rectangle23(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    int getArea() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
        Rectangle23 r1 = new Rectangle23();
        System.out.println("r1.width= " + r1.width);
        System.out.println("r1.height = " + r1.height);
        System.out.println("r1 getArea = " + r1.getArea());
        Rectangle23 r2 = new Rectangle23(-90, -10);
        System.out.println("r2.width= " + r2.width);
        System.out.println("r2.height = " + r2.height);
        System.out.println("r2 getArea = " + r2.getArea());
    }
}
