import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(18, 182, 75.00);
    }

    @Test
    public void hasDetails(){
        assertEquals(18, visitor.getAge());
        assertEquals(182, visitor.getHeight());
        assertEquals(75.00, visitor.getMoney(), 0.1);
    }
}
