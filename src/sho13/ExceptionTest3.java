package sho13;

/**
 * list13-3
 * メソッドの呼び出しの中から投げられる例外
 */
public class ExceptionTest3 {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        try {
            System.out.println("代入します");
            myAssign(myArray, 100, 0);
            System.out.println("代入しました");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("代入できませんでした");
            System.out.println("例外は" + e + "です");
        }
        System.out.println("終了します");
    }

    static void myAssign(int[] array, int index, int value) {
        System.out.println("myAssignに来ました");
        array[index] = value;
        System.out.println("myAssignから帰ります");
    }
}
