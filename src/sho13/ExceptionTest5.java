package sho13;

import java.io.IOException;

/**
 * 問題13－3
 * 例外がどのメソッドから投げられているか実行結果で判断できるようなプログラム
 */
public class ExceptionTest5 {
    public static void main(String[] args) {
        try {
            method1(-4);
            method2(0);
            method3(0);
        } catch (Exception e) {
            System.out.println("例外:" + e);
            e.printStackTrace();
        }
    }

    static void method1(int x) throws Exception {
        if (x < 0) {
            throw new Exception();
        }
    }

    static void method2(int x) throws Exception {
        if (x == 0) {

        } else {
            throw new Exception();
        }
    }

    static void method3(int x) throws Exception {
        if (x > 0) {
            throw new Exception();
        }
    }
}
