public enum Treasure {

    GOLD(200),
    SILVER(150),
    DIAMONDS(500);

    private int value;

    Treasure(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
