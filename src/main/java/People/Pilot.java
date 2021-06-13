package People;

public class Pilot {

    private String name;
    private CabinCrewRank rank;

    public Pilot(String name, CabinCrewRank rank) {
        this.name = name;
        this.rank =  rank;
    }

    public String getName() {
        return name;
    }

    public CabinCrewRank getRank() {
        return rank;
    }
}
