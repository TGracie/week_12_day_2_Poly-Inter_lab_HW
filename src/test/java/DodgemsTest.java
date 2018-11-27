import Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Bunce Boys", 3, 30, 140);
    }

    @Test
    public void setHeightLimit(){
        dodgems.setHeightLimit(135);
        assertEquals(135, dodgems.getHeightLimit());
    }
}
