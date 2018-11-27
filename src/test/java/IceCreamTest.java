import Stalls.IceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamTest {

    IceCream stall;

    @Before
    public void before(){
        stall = new IceCream("Luca", "Luke", 4);
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, stall.countFlavours());
    }

    @Test
    public void canAddFlavours(){
        stall.addFlavour("Chocolate");
        assertEquals(1, stall.countFlavours());
    }

    @Test
    public void canRemoveFlavours(){
        canAddFlavours(); // probably not best practice here
        stall.removeFlavour("Chocolate");
        assertEquals(0, stall.countFlavours());
    }
}
