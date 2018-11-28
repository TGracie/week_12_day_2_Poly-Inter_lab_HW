import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamTest {

    IceCream stall;

    @Before
    public void before(){
        stall = new IceCream("Luca", "Luke", 4, 4);
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, stall.countItems());
    }

    @Test
    public void canAddFlavours(){
        stall.addItem("Chocolate");
        assertEquals(1, stall.countItems());
    }

    @Test
    public void canRemoveFlavours(){
        canAddFlavours(); // probably not best practice here
        stall.removeItem("Chocolate");
        assertEquals(0, stall.countItems());
    }
}
