package sho7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 下のプログラムをcontinue文を使わない形式に書き換える
 * <pre>{@code
 * public class Mondai4 {
 *     public static void main(String[] args) {
 *         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 *         try {
 *             String line;
 *             while ((line = reader.readLine()) != null) {
 *                 if (!line.endsWith("{") && !line.endsWith("}")) {
 *                     continue;
 *                 }
 *                 System.out.println(line);
 *             }
 *         }  catch (IOException e) {
 *             System.out.println(e);
 *         }
 *     }
 * }
 * }</pre>
 */
public class Mondai4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.endsWith("{") || !line.endsWith("}")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
