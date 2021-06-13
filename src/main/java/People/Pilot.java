package People;

public class Pilot extends Person{

    private String name;
    private CabinCrewRank rank;

    public Pilot(String name, CabinCrewRank rank) {
        super(name);
        this.rank =  rank;
    }

    public String getName() {
        return name;
    }

    public CabinCrewRank getRank() {
        return rank;
    }
}
