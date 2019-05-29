package sho16;

/**
 * 問題16－11
 * list16-6のGoodBankTestはGoodBankのインスタンスを生成して預金の預け入れと引き出しを行った。
 * これを変更して銀行口座がたった一つしかないプログラムにする。
 * クラスの名前はOneBankTestとOneBankにすること。
 */
public class OneBank {
    private static int value = 0;

    public static synchronized void addMoney(int money) {
        int currentValue = value;
        System.out.println(Thread.currentThread() + "が　addMoney に入りました。");
        value += money;
        if (currentValue + money != value) {
            System.out.println(Thread.currentThread() + "で矛盾が発生しました！");
            System.exit(-1);
        }
        System.out.println(Thread.currentThread() + "が addMoney から出ました。");
    }
}
