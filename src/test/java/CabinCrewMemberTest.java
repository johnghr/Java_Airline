import People.CabinCrewMember;
import People.CabinCrewRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void setUp(){
        cabinCrewMember = new CabinCrewMember("Susie", CabinCrewRank.CAPTIAN);
    }

    @Test
    public void crewMemberHasName(){
        assertEquals("Susie", cabinCrewMember.getName());
    }

    @Test
    public void crewMemberHasRank(){
        assertEquals(CabinCrewRank.CAPTIAN, cabinCrewMember.getRank());
    }
}
