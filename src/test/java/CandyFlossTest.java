import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossTest {

    Candyfloss candy;


    @Before
    public void before(){
        candy = new Candyfloss("Clouds", "Frank", 2);
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, candy.countItems());
    }

    @Test
    public void canAddFlavours(){
        candy.addItem("Blue");
        assertEquals(1, candy.countItems());
    }

    @Test
    public void canRemoveFlavours(){
        canAddFlavours(); // probably not best practice here
        candy.removeItem("Blue");
        assertEquals(0, candy.countItems());
    }

}
