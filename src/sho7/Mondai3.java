package sho7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 以下のルールに従って処理を行い標準出力に出すプログラムを作成。
 * ルール1(開始)：最初に一度だけ<!DOCTYPE html>,<html>,<head>,<title>My Page</title>,</head>,<body>の6行を表示
 * ルール２(終了)：標準入力が終わったら、最後の行に</body>,</html>の2行を表示
 * ルール３(見出し1)：入力行が"■"で始まっていたら■を取り除いた残りの文字列を"<h1>"と"</h1>"で挟んで改行付きで出力
 * ルール４(見出し2)：入力行が"●"で始まっていたら●を取り除いた残りの文字列を"<h2>"と"</h2>"で挟んで改行付きで出力
 * ルール５(段落)：入力行がルール３にも４にも当てはまらないなら、入力行を"<p>"と"</p>"で挟んで改行付きで出力
 */
public class Mondai3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            //ルール１
            System.out.println("<!DOCTYPE html>");
            System.out.println("<html>");
            System.out.println("<head>");
            System.out.println("<title>My page</title>");
            System.out.println("</head>");
            System.out.println("<body>");
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("■")) {
                    //ルール３
                    System.out.println("<h1>" + line.substring(1) + "</h1>");
                } else if (line.startsWith("●")) {
                    //ルール４
                    System.out.println("<h2>" + line.substring(1) + "</h2>");
                } else {
                    //ルール５
                    System.out.println("<p>" + line + "</p>");
                }
            }
            //ルール２
            System.out.println("</body>");
            System.out.println("</html>");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
