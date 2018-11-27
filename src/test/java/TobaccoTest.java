import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoTest {
    Tobacco tob;


    @Before
    public void before(){
        tob = new Tobacco("Clouds", "Frankie", 1);
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, tob.countItems());
    }

    @Test
    public void canAddFlavours(){
        tob.addItem("Kingstons");
        assertEquals(1, tob.countItems());
    }

    @Test
    public void canRemoveFlavours(){
        canAddFlavours(); // probably not best practice here
        tob.removeItem("Kingstons");
        assertEquals(0, tob.countItems());
    }

}
