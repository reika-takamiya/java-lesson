package sho10;

/**
 * 名前(name)と価格(price)を持つ「製品」を表すクラスを作成
 */
public class ProductItem {
    String name;
    int price;

    @Override
    public String toString() {
        return "[" + "name" + "," + " price" + "]";
    }
}
