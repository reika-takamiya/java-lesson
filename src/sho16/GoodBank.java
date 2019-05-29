package sho16;

/**
 * list16-5
 * 良い銀行
 */
public class GoodBank {
    private int value = 0;

    public synchronized void addMoney(int money) {
        int currentValue = value;
        System.out.println(Thread.currentThread() + "がaddMoneyに入りました。");
        value += money;
        if (currentValue + money != value) {
            System.out.println(Thread.currentThread() + "で矛盾が生じました！");
            System.exit(-1);
        }
        System.out.println(Thread.currentThread() + "がaddMoneyから出ました。");
    }
}
