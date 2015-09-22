package zhangxinyu.kata.java8;

import java.util.stream.Stream;

/**
 * Created by zhangxinyu on 15/9/22.
 */
public interface Performance {
    public String getName();

    public Stream<Artist> getMusicians();

    public default Stream<Artist> getAllMusicians() {
        return getMusicians().flatMap(artist -> Stream.concat(Stream.of(artist), artist.getMembers()));
    }
}
