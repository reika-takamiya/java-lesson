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
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
        this.width = width;
        this.height = height;
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

        /* 試し書きなので気にしないでください。
        Rectangle23 r3 = new Rectangle23();
        r3.setSize(30, 90);
        System.out.println("r3.width= " + r3.width);
        System.out.println("r3.height = " + r3.height);
        System.out.println("r3 getArea = " + r3.getArea());
        */
    }
}
