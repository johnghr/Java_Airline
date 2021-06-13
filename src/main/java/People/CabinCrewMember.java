package People;

public class CabinCrewMember extends Person {

    private CabinCrewRank rank;

    public CabinCrewMember(String name, CabinCrewRank rank) {
        super(name);
        this.rank = rank;
    }

    public CabinCrewRank getRank() {
        return rank;
    }
}
