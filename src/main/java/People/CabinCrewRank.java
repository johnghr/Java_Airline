package People;

public enum CabinCrewRank {

    CAPTAIN(1),
    PILOT(2),
    FLIGHTATTENDANT(3);

    private final int value;

    CabinCrewRank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
