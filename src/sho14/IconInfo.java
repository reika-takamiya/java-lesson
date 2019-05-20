package sho14;


import java.awt.*;

/**
 * 問題14－3
 * 下のメソッドとフィールドを持つIconInfoというpublicなインタフェースを宣言する。
 * ・引数はint型で仮引数の名前はiconType、戻り値の型はImage型で、名前がgetIconであるメソッド
 * ・型はintで名前はICON_16x16、値は1であるフィールド
 * ・型はintで名前はICON_32x32、値は2であるフィールド
 */
public interface IconInfo {
    public static final int ICON_16x16 = 1;
    public static final int ICON_32x32 = 2;

    Image getIcon(int iconType);
}

