# Java_Airline

Your task is to model a system for the world renowned airline JavaAir, to allow them to manage their flights. You should use the tools you have learnt this week where appropriate and useful. Remember to TDD!

JavaAir doesn't really exist (sadly) - don't stress about how a "real" example of this would work differently. This is just an exercise to practice some different concepts.

Assumptions:

Each passenger bag weighs the same
Planes reserve half of their total weight for passenger bags
The weight of bag per person is the weight reserved for passenger bags divided by the capacity
Passengers exist for a single flight only
MVP
A Passenger has:

a name
a number of bags
A CabinCrewMember has:

a name
a rank (e.g Captain/First Officer/Purser, Flight Attendant)
Hint
A Pilot has:

a name
a rank
a pilot licence number (you can use a String for this)
A Plane has:

an plane type (e.g. BOEING747) which stores capacity and total weight
Hint
A Flight has:

at least one Pilot
a list of CabinCrewMembers (you can decide the number)
an empty list of booked Passenger's
a Plane
flight number (i.e. "FR756")
destination (i.e. GLA, EDI)
departure airport (i.e. GLA, EDI)
departure time (use a String)
The Flight should be able to:

return the number of available seats
book a passenger (if there are remaining seats)
A Pilot should be able to:

fly the plane (a simple method which returns a String is sufficient)
A CabinCrewMember should be able to:

relay messages to the passengers(a simple method which returns a String is sufficient)
