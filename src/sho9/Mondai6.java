package sho9;

/**
 * 番号指定のあいさつプログラムを完成させる
 */
public class Mondai6 {
    public static void main(String[] args) {
        String[] message = new String[3];
        message[0] = "おはよう！";
        message[1] = "こんにちは！";
        message[2] = "こんばんは！";
        if (args.length != 1) {
            System.out.println("使い方：java SelectGreeting 番号");
            System.exit(0);
        }
        int number = Integer.parseInt(args[0]);
        if (0 <= number && number < message.length) {
            System.out.println(message[number]);
        } else {
            System.out.println("番号は0～" + (message.length - 1) + "の範囲で指定してください。");
        }
    }
}
