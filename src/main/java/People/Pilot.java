package People;

public class Pilot extends CabinCrewMember{

    private String licenceNumber;

    public Pilot(String name, CabinCrewRank rank, String licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }
}
