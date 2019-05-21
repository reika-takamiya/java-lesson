package sho12;

/**
 * 問題12－5
 *
 * 問題12－4のPlacedRectangleをRectangleのサブクラスとしてではなく、
 * Rectangle型のインスタンス変数を持つクラスとして宣言。
 */
public class PlacedRectangle {
    int x;
    int y;
    Rectangle15 rectangle;

    PlacedRectangle() {
        rectangle = new Rectangle15();
        setLocation(0,0);
    }
    PlacedRectangle(int x,int y) {
        rectangle = new Rectangle15();
        setLocation(x,y);
    }
    PlacedRectangle(int x,int y,int width,int height) {
        rectangle = new Rectangle15(width,height);
        setLocation(x,y);
    }
    void setLocation(int x,int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "[" + "(" + x + "," + y + ")" +  rectangle + "]";
    }
    public static void main(String[] args) {
        PlacedRectangle15 a = new PlacedRectangle15();
        PlacedRectangle15 b = new PlacedRectangle15(12, 34);
        PlacedRectangle15 c = new PlacedRectangle15(34, 45, 56, 67);
        c.setLocation(45, 56);
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("c =" + c);
    }
}
