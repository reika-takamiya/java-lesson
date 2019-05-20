package sho15;

/**
 * 問題15‐2　クラスA
 */
public class ClassA {
    public static ClassA last = null;
    public String name;

    public ClassA(String name) {
        this.name = name;
        last = this;
        System.out.println(this + "が生まれました。");
    }

    @Override
    public String toString() {
        return "" + "[" + name + "]";
    }
}


