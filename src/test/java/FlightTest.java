import People.CabinCrewMember;
import People.CabinCrewRank;
import People.Passenger;
import People.Pilot;
import Plane.Plane;
import Plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private CabinCrewMember cabinCrewMember;
    private CabinCrewMember cabinCrewMemberTwo;
    private Passenger passenger;
    private Passenger passengerTwo;
    private Passenger passengerThree;

    @Before
    public void setUp(){
        cabinCrewMembers = new ArrayList<CabinCrewMember>();
        passengers = new ArrayList<Passenger>();
        pilot = new Pilot("Brenda", CabinCrewRank.PILOT, "55ET732O99");
        plane = new Plane(PlaneType.BOEING737);
        flight = new Flight(
            pilot,
            cabinCrewMembers,
            passengers,
            plane,
            7,
            "Heathrow",
            "Glasgow",
            "17:55"
        );
        cabinCrewMember = new CabinCrewMember("Giuliano", CabinCrewRank.FLIGHTATTENDANT);
        cabinCrewMemberTwo = new CabinCrewMember("Steve", CabinCrewRank.FLIGHTATTENDANT);
        flight.addCabinCrewMember(cabinCrewMemberTwo);
        flight.addCabinCrewMember(cabinCrewMember);
        passenger = new Passenger("Barry", 2);
        passengerTwo = new Passenger("Barbra", 3);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passengerTwo);
    }

    @Test
    public void flightHasPilot(){
        assertEquals("Brenda", flight.getPilotName());
    }

    @Test
    public void flightHasCrew(){
        assertEquals(2, flight.getCabinCrewMembers().size());
    }

    @Test
    public void flightHasPassengers(){
        assertEquals(2, flight.getPassengers().size());
    }

    @Test
    public void flightCantExceedCapacity(){
        passengerThree = new Passenger("Graham", 5);
        flight.bookPassenger(passengerThree);
        assertEquals(2, flight.getPassengers().size());
    }

    @Test
    public void flightHasAPlane(){
        assertEquals(PlaneType.BOEING737, flight.getPlane());
    }

    @Test
    public void flightHasAFlightNumber(){
        assertEquals(7, flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("Heathrow", flight.getDestination());
    }

    @Test
    public void flightHasADeparture(){
        assertEquals("Glasgow", flight.getDeparture());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("17:55", flight.getDepartureTime());
    }

}
