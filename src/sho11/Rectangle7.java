package sho11;

/**
 * list11-7
 * mainメソッド
 */
public class Rectangle7 {
    int width;
    int height;

    Rectangle7() {
        setSize(10, 20);
    }

    Rectangle7(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
        Rectangle7 r1 = new Rectangle7();
        System.out.println("r1.width= " + r1.width);
        System.out.println("r1.height = " + r1.height);
        System.out.println("r1 getArea = " + r1.getArea());
        Rectangle7 r2 = new Rectangle7(123, 45);
        System.out.println("r2.width= " + r2.width);
        System.out.println("r2.height = " + r2.height);
        System.out.println("r2 getArea = " + r2.getArea());

        /* 試し書きなので気にしないでください。
        Rectangle7 r3 = new Rectangle7();
        r3.setSize(30, 90);
        System.out.println("r3.width= " + r3.width);
        System.out.println("r3.height = " + r3.height);
        System.out.println("r3 getArea = " + r3.getArea());
        */
    }

}
