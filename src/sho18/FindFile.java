package sho18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 問題18‐2
 * ファイル中に特定の文字列を含んでいるかどうかを調べるプログラムを作成。
 * 起動の時の引数は、「java FindFile 検索文字列　検索対象ファイル」のようにして、
 * 文字列が見つかったらその行の行番号とその行そのものを表示する。
 */
public class FindFile {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用法：java FindFile 検索文字列　検索対象ファイル");
            System.out.println("例：java FindFile System FindFile.java");
            System.exit(0);
        }
        String findString = args[0];
        String fileName = args[1];
        try {
            String line;
            int linenumber = 1;
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            while ((line = reader.readLine()) != null) {
                int n = line.indexOf(findString);
                if (n >= 0) {
                    System.out.println(linenumber + ":" + line);
                }
                linenumber++;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(fileName + "が見つかりません。");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
