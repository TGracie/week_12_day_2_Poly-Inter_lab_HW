import ThemePark.Attractions.Rollercoaster;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster typhoon;
    Visitor vis;
    Visitor vis2;
    Visitor vis3;

    @Before
    public void before(){
        typhoon = new Rollercoaster("Typhoon", 4, 150, 14, 6, 60, 10.00);
        vis = new Visitor(14, 160, 50);
        vis2 = new Visitor(13, 160, 50);
        vis3 = new Visitor(16, 130, 50);
    }

    @Test
    public void hasDetails(){
        assertEquals("Typhoon", typhoon.getName());
        assertEquals(4, typhoon.getRating());
        assertEquals(150, typhoon.getHeightLimit());
        assertEquals(6, typhoon.getLength());
        assertEquals(60, typhoon.getCapacity());
    }

    @Test
    public void setHeightLimit(){
        typhoon.setHeightLimit(160);
        assertEquals(160, typhoon.getHeightLimit());
    }

    @Test
    public void visitorCanRide(){
        assertEquals(true, typhoon.isAllowedTo(vis));
    }

    @Test
    public void goAway(){
        assertEquals(false, typhoon.isAllowedTo(vis2));
    }

    @Test
    public void goAway2(){
        assertEquals(false, typhoon.isAllowedTo(vis3));
    }

    @Test
    public void differentPrices(){
        assertEquals(7.50, typhoon.priceForVisitor(vis), 0.1);
        assertEquals(10.00, typhoon.priceForVisitor(vis3), 0.1);
    }
}
