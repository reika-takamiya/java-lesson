package sho12;

/**
 * 「java Rectangle17」とコンパイルして実行したときどのように表示されるか。
 */
class Rectangle16 {
    Rectangle16() {
        System.out.println("1:Rectangle16()");
    }

    Rectangle16(int x) {
        System.out.println("2:Rectangle16(int x)");
    }
}

class Rectangle17 extends Rectangle16 {
    Rectangle17() {
        System.out.println("3:Rectangle17()");
    }

    Rectangle17(int x) {
        System.out.println("4:Rectangle17(int x)");
    }

    Rectangle17(String text) {
        super(789);
        System.out.println("5:Rectangle17(String text)");
    }

    public static void main(String[] args) {
        System.out.println("-----");
        new Rectangle16();
        System.out.println("-----");
        new Rectangle17();
        System.out.println("-----");
        new Rectangle16(123);
        System.out.println("-----");
        new Rectangle17(456);
        System.out.println("-----");
        new Rectangle17("test");
        System.out.println("-----");
    }
}
