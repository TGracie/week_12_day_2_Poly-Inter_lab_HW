import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
        playground = new Playground("Little Tykes", 3, 15);
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
}
