package sho11;

/**
 * 問題11－9
 * Rectangleクラスの幅と高さのほかに、「左上すみの位置」を表すxとyというフィールドを追加する
 * (1)フィールド
 * 　(1a)指定がない時の幅と高さ(INITIAL_WIDTH,INITIAL_HEIGHT)
 * (2)コンストラクタ
 * (2a)引数がないもの(width,heightの初期値はINITIAL_WIDGH,INITIAL_HEIGHT,xとyは0)
 * (2b)width,heightだけをしていしたもの(xとyは0)
 * (2c)x,y,width,heightを指定したもの
 * (3)メソッド
 * (3a)位置をしていするvoid setLocation(int x,int y)メソッド
 * (3b)大きさを指定するvoid setSize(int width,int height)メソッド
 * (3c)[x,y,width,height]の形式で文字列として表現するtoStringメソッド
 * (3d)長方形の「重なり部分」(これも長方形)を得るintersect(Rectangle r)メソッド。
 * 　　ただし、重なりがない場合にはnullを返す
 */
public class Rectangle24 {
    final int INITIAL_WIDTH = 10;
    final int INITIAL_HEIGHT = 20;
    int width;
    int height;
    int x;
    int y;

    Rectangle24() {
        width = INITIAL_WIDTH;
        height = INITIAL_HEIGHT;
        x = 0;
        y = 0;
    }

    Rectangle24(int width, int height) {
        setSize(width, height);
        this.x = 0;
        this.y = 0;
    }

    Rectangle24(int x, int y, int width, int height) {
        setLocation(x, y);
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + this.x + "," + this.y + "," + this.width + "," + this.height + "]";
    }

    Rectangle24 intersect(Rectangle24 rectangle) {
        int startX = Math.max(this.x, rectangle.x);
        int startY = Math.max(this.y, rectangle.y);
        int endX = Math.min(this.x + this.width, rectangle.x + rectangle.width);
        int endY = Math.min(this.y + this.height, rectangle.y + rectangle.height);
        int newWidth = endX - startX;
        int newHeight = endY - startY;
        if (newWidth > 0 && newHeight > 0) {
            return new Rectangle24(startX, startY, newWidth, newHeight);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Rectangle24 a = new Rectangle24(0, 0, 20, 10);
        Rectangle24 b = new Rectangle24(5, 5, 20, 10);
        Rectangle24 c = new Rectangle24(20, 10, 20, 10);
        Rectangle24 d = new Rectangle24(-10, -20, 100, 200);
        Rectangle24 e = new Rectangle24(21, 11, 20, 10);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);
        System.out.println("e=" + e);
        System.out.println("a と a の重なり = " + a.intersect(a));
        System.out.println("a と b の重なり = " + a.intersect(b));
        System.out.println("a と c の重なり = " + a.intersect(c));
        System.out.println("a と d の重なり = " + a.intersect(d));
        System.out.println("a と e の重なり = " + a.intersect(e));
    }
}
