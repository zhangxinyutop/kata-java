package zhangxinyu.kata;

import org.junit.Test;
import zhangxinyu.kata.java8.Album;
import zhangxinyu.kata.java8.Artist;
import zhangxinyu.kata.java8.SampleData;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static junit.framework.Assert.assertEquals;

/**
 * Created by zhangxinyu on 15/9/22.
 */
public class TestPerformance {

    @Test
    public void allMembers() {
        Album album = new Album("foo", Collections.emptyList(), Collections.singletonList(SampleData.theBeatles));
        Set<Artist> musicians = album.getAllMusicians().collect(Collectors.toSet());
        Set<Artist> expectedMusicians = new HashSet<>(SampleData.membersOfTheBeatles);
        expectedMusicians.add(SampleData.theBeatles);
        assertEquals(expectedMusicians, musicians);
    }

}
