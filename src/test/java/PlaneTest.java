import Plane.Plane;
import Plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.BOEING737, plane.getType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(5, plane.getType().getCapacity());
    }

    @Test
    public void planeHasTotalWeight(){
        assertEquals(110, plane.getType().getTotalWeight());
    }

}
