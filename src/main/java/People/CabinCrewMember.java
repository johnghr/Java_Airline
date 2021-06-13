package People;

public class CabinCrewMember extends Person {

    private String name;
    private CabinCrewRank rank;

    public CabinCrewMember(String name, CabinCrewRank rank) {
        super(name);
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public CabinCrewRank getRank() {
        return rank;
    }
}
