package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor joseph;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        joseph=new Visitor (38,1.6,60.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void hasBouncer(){
        assertEquals(false, playground.isAllowed(joseph));
    }
}
