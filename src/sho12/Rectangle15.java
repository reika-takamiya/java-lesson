package sho12;

/**
 * 　問題12－4
 * ・位置を表すint型のフィールドx,yを持つ
 * ・3つのコンストラクタを持つ
 * 　(1)引数なし　(2)位置付き　(3)位置と大きさ付き
 * ・位置を変更するメソッドsetLocationを持つ
 * ・標準的な文字列表現を返すメソッドtoStringを持つ
 * 　x = 12,y = 34, width = 123, height = 45のとき、
 * [ (12, 34) [123, 45] ]となるものとする。
 * ただし、Rectangleクラスは下のように宣言されているとする。
 *
 * <pre>{@code
 *   class Rectangle15 {
 *     int width;
 *     int height;
 *     Rectangle15() {
 *         setSize(0,0);
 *     }
 *     Rectangle15(int width,int height) {
 *         setSize(width,height);
 *     }
 *     void setSize(int width,int height) {
 *     this.width = width;
 *     this.height = height;
 *     }
 *     @Override
 *     public String toString() {
 *         return "[" + width + "," + height + "]";
 *     }
 * }
 *   }
 *   </pre>
 */
class Rectangle15 {
    int width;
    int height;

    Rectangle15() {
        setSize(0, 0);
    }

    Rectangle15(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[" + width + "," + height + "]";
    }
}

class PlacedRectangle15 extends Rectangle15 {
    int x;
    int y;

    PlacedRectangle15() {
        setLocation(0, 0);
    }

    PlacedRectangle15(int x, int y) {
        setLocation(x, y);
    }

    PlacedRectangle15(int x, int y, int width, int height) {
        super(width, height);
        setLocation(x, y);
    }

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + "(" + x + "," + y + ")" + super.toString() + "]";
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
