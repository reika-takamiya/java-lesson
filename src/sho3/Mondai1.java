package sho3;

/**
 * 光の速度を秒速30万キロメートルとし、一日に進む距離を計算して求める。
 */
public class Mondai1 {
    public static  void main(String[] args) {
        long speed = 300000L;
        long time= 86400L;
        System.out.println("光が一日に進む距離は" + (speed * time) + "kmです。");
    }
}
