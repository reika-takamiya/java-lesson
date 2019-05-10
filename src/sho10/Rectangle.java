package sho10;

/**
 * 次のような「長方形」クラスを宣言する。
 * ・クラスの名前はRectangle
 * ・「幅」を表すint型のフィールド「width」
 * ・「高さ」を表すint型のフィールド「height」
 * ・幅と高さを指定するコンストラクタを持つ
 * ・幅が123で高さが45の時、[123,45]という文字列を得るためのtoStringメソッドを持つ
 */
public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[" + width + "," + height + "]";
    }
}
