import Attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster typhoon;

    @Before
    public void before(){
        typhoon = new Rollercoaster("Typhoon", 4, 150, 4, 60);
    }

    @Test
    public void hasDetails(){
        assertEquals("Typhoon", typhoon.getName());
        assertEquals(4, typhoon.getRating());
        assertEquals(150, typhoon.getHeightLimit());
        assertEquals(4, typhoon.getLength());
        assertEquals(60, typhoon.getCapacity());
    }

    @Test
    public void setHeightLimit(){
        typhoon.setHeightLimit(160);
        assertEquals(160, typhoon.getHeightLimit());
    }
}
