package sho3;

import java.io.*;

/**
 * 2人の名前と年齢を入力するとその人たちの年齢の平均を表示するプログラムを書く
 */
public class Mondai2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            //1人目
            System.out.println("1人目の名前を入力してください。");
            String name1 = reader.readLine();
            System.out.println(name1 + "さんの年齢を入力してください。");
            String line = reader.readLine();
            int age1 = Integer.parseInt(line);
            //2人目
            System.out.println("2人目の名前を入力してください。");
            String name2 = reader.readLine();
            System.out.println(name2 + "さんの年齢を入力してください。");
            line = reader.readLine();
            int age2 = Integer.parseInt(line);
            //平均
            System.out.println(name1 + "さんと" + name2 + "さんの年齢の平均は" + (age1 + age2) / 2.0 + "歳です。");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("年齢が正しくありません。");
        }
    }
}
