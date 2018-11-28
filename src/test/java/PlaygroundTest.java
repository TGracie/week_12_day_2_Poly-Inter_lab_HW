import ThemePark.Attractions.Playground;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor vis1;
    Visitor vis2;

    @Before
    public void before(){
        playground = new Playground("Little Tykes", 3, 15);
        vis1 = new Visitor(15, 160, 25);
        vis2 = new Visitor(12, 130, 25);
    }

    @Test
    public void hasDetails(){
        assertEquals("Little Tykes", playground.getName());
        assertEquals(3, playground.getRating());
        assertEquals(15, playground.getMaxAge());
    }

    @Test
    public void setMaxAge(){
        playground.setMaxAge(13);
        assertEquals(13, playground.getMaxAge());

    }

    @Test
    public void cusstomerTest(){
        assertEquals(false, playground.isAllowedTo(vis1));
        assertEquals(true, playground.isAllowedTo(vis2));
    }
}
