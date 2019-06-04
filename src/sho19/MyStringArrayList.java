package sho19;

/**
 * 問題19‐3
 * 下のようなクラスMyStringArrayListを作る。
 * ・コンストラクタの中でIITIAL_CAPACITY個の要素を持つStringの配列をarフィールドに確保する。
 * ・addメソッドで要素を追加する。配列arがいっぱいだったら、長さを2倍にした新しい配列を確保したうえで追加する。
 * ・getメソッドで要素を参照する。添え字が範囲外なら、例外IndexOutOfBoundsExceptionをthrowする。
 * ・sizeメソッドで格納されている要素数(ar.lengthではない)を返す。
 */
public class MyStringArrayList {
    private static final int INITIAL_CAPACITY = 4;
    private String[] ar;
    private int sz;

    public MyStringArrayList() {
        ar = new String[INITIAL_CAPACITY];
        sz = 0;
    }

    public void add(String s) {
        if (ar.length == sz) {
            String[] newAr = new String[ar.length * 2];
            System.arraycopy(ar, 0, newAr, 0, ar.length);
            ar = newAr;
        }
        ar[sz] = s;
        sz++;
    }

    public String get(int n) {
        if (0 <= n && n < sz) {
            return ar[n];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int size() {
        return sz;
    }
}
