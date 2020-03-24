package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor joseph;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5,4.50);
        joseph=new Visitor(38,160.00,60.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void normalCharge(){
        assertEquals(4.50,dodgems.priceFor(joseph),0.1);
    }
}
