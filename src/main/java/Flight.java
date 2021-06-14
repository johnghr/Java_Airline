import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import Plane.Plane;
import Plane.PlaneType;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private int flightNumber;
    private String destination;
    private String departure;
    private String departureTime;

    public Flight(Pilot pilot, ArrayList cabinCrewMembers, ArrayList passengers, Plane plane, int flightNumber, String destination, String departure, String departureTime){
        this.pilot = pilot;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }

    public int getNumberOfAvailableSeats(){
        int availableSeats = plane.getType().getCapacity() - passengers.size();
        return availableSeats;
    }

    public void bookPassenger(Passenger passenger){
        if (getNumberOfAvailableSeats() > 0){
            passengers.add(passenger);
        }
    }

    public String getPilotName(){
        return pilot.getName();
    }

    public ArrayList getCabinCrewMembers(){
        return cabinCrewMembers;
    }

    public void addCabinCrewMember(CabinCrewMember cabinCrewMember){
        cabinCrewMembers.add(cabinCrewMember);
    }

    public ArrayList getPassengers(){
        return passengers;
    }

    public PlaneType getPlane() {
        return plane.getType();
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
