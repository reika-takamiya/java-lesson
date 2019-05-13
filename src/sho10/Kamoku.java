package sho10;

public class Kamoku {
    String name;
    int score;

    /**
     * コンストラクタ
     *
     * @param name  科目名
     * @param score 各科目の点数
     */
    public Kamoku(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * 科目の文字列表現
     *
     * @return 戻り値
     */
    @Override
    public String toString() {
        return name + "は" + score + "点";
    }
}
