package sho9;

/**
 * 　科目を表すクラス
 */
public class Kamoku {
    String name; //科目名
    int score;   //点数

    //科目の作成
    public Kamoku(String namae, int tensuu) {
        this.name = namae;
        this.score = tensuu;
    }

    //科目の文字列表現
    @Override
    public String toString() {
        return name + "は" + score + "点";
    }
}
