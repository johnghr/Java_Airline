import People.Pilot;
import People.CabinCrewRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void setUp(){
        pilot = new Pilot("Brenda", CabinCrewRank.PILOT, "55ET732O99");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Brenda", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(CabinCrewRank.PILOT, pilot.getRank());
    }

    @Test
    public void pilotHasLicence(){
        assertEquals("55ET732O99", pilot.getLicenceNumber());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("Weeeeeeeee! I'm flying a plane!", pilot.flyPlane());
    }
}