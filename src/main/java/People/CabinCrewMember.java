package People;

public class CabinCrewMember {

    private String name;
    private CabinCrewRank rank;

    public CabinCrewMember(String name, CabinCrewRank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public CabinCrewRank getRank() {
        return rank;
    }
}
