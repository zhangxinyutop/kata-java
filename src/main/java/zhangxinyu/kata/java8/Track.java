package zhangxinyu.kata.java8;

/**
 * Created by zhangxinyu on 15/9/22.
 */
public final class Track {
    private final String name;
    private final int length;

    public Track(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public Track copy() {
        return new Track(name, length);
    }
}
