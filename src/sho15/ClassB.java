package sho15;

/**
 * 問題15‐2　クラスB
 */
public class ClassB extends ClassA {
    public ClassA friend;

    public ClassB(String name) {
        super(name);
    }

    public ClassB(String name, ClassA friend) {
        super(name);
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "[" + name + "," + friend + "]";
    }
}
