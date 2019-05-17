package sho13;

/**
 * 　問題13－2
 * 　list13-3の例外処理をmainメソッドからmyAssignメソッドに移す。
 */
public class ExceptionTest3a {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        myAssign(myArray, 100, 0);
        System.out.println("終了します");
    }

    static void myAssign(int[] array, int index, int value) {
        System.out.println("myAssignに来ました");
        try {
            System.out.println("代入します");
            array[index] = value;
            System.out.println("代入しました");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("代入できませんでした");
            System.out.println("例外は" + e + "です");
        }
        System.out.println("myAssignから帰ります");
    }
}
