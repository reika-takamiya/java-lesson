package sho7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 大文字を小文字に変換するプログラム
 */
public class CopyLower {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                String i = line.toLowerCase();
                System.out.println(i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
