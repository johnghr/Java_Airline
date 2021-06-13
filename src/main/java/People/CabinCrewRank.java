package People;

public enum CabinCrewRank {

    CAPTIAN(1),
    FLIGHTATTENDANT(2);

    private final int value;

    CabinCrewRank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
