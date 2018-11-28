import ThemePark.Stalls.Tobacco;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoTest {
    Tobacco tob;
    Visitor vis1;
    Visitor vis2;


    @Before
    public void before(){
        tob = new Tobacco("Clouds", "Frankie", 1, 2);
        vis1 = new Visitor(18, 180, 60);
        vis2 = new Visitor(16, 140, 60);
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

    @Test
    public void customerTest(){
        assertEquals(true, tob.isAllowedTo(vis1));
        assertEquals(false, tob.isAllowedTo(vis2));
    }

}
