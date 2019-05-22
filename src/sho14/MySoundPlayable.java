package sho14;

/**
 * 問題14－4
 * 下のMyMediaPlayableインタフェースを拡張してMySoundableという名前のサブインタフェースを宣言する
 * getSoundNameメソッドを追加する。
 *
 * <pre>{@code
 * interface MyMediaPlayable {
 *     void play();
 *     void stop();
 *     void loop();
 *     }
 * }</pre>
 */
interface MySoundPlayable extends MyMediaPlayable {
    String getSoundPlayable();
}
