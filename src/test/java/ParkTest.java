import ThemePark.Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Woody Allen", 4);
    }

    @Test
    public void hasDetails(){
        assertEquals("Woody Allen", park.getName());
        assertEquals(4, park.getRating());
    }

}
