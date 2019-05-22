package sho15;

/**
 * 問題15‐2
 * 生き残っているインスタンスは何か。
 */
public class GcQuiz {
    public static ClassA q = new ClassA("ジマイマ");
    public ClassA r = new ClassA("レベッカ");

    public static void main(String[] args) {
        ClassA a = new ClassA("ミトン");
        ClassA b = new ClassA("トム");
        ClassA c = new ClassA("モペット");
        ClassB[] arrayA = new ClassB[4];
        b = c;
        for (int i = 0; i < 4; i++) {
            arrayA[i] = new ClassB("犬" + i);
        }
        arrayA[3].friend = arrayA[3];
        arrayA[0] = arrayA[1];
        c = arrayA[2];
        arrayA[1] = null;
        ClassA d = arrayA[0];
        ClassB arrayB[] = new ClassB[4];
        arrayB[0] = new ClassB("フロプシー", new ClassA("野ネズミ"));
        arrayB[1] = new ClassB("モプシー", new ClassA("ナトキン"));
        arrayB[2] = new ClassB("カトンテール", c);
        arrayB[3] = new ClassB("ピーター", new ClassA("ベンジャミン"));
        arrayA = null;
        arrayB[0].friend = null;
        arrayB[1] = null;
        arrayB[2] = null;
        ClassB e = new ClassB("ルーシー", new ClassA("ティギー"));
        e = null;

        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("c =" + c);
        System.out.println("d =" + d);
        System.out.println("e =" + e);
        System.out.println("arrayA =" + arrayA);
        System.out.println("arrayA[0] =" + arrayB[0]);
        System.out.println("arrayA[1] =" + arrayB[1]);
        System.out.println("arrayA[2] =" + arrayB[2]);
        System.out.println("arrayA[3] =" + arrayB[3]);
        System.out.println("ClassA.last = " + ClassA.last);
        System.out.println("GcQuiz.q = " + GcQuiz.q);
    }
}
