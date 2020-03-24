package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor joseph;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10,8.40);
        joseph=new Visitor(38,160.00,60.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void  hasBouncer(){
        assertEquals(true, rollerCoaster.isAllowed(joseph));
    }

    @Test
    public void normalheight(){
        assertEquals(8.40,rollerCoaster.priceFor(joseph),0.1);
    }
}
