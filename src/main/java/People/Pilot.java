package People;

public class Pilot extends CabinCrewMember{

    private String name;
    private CabinCrewRank rank;
    private int licenceNumber;

    public Pilot(String name, CabinCrewRank rank, int licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public int getLicenceNumber() {
        return licenceNumber;
    }
}
