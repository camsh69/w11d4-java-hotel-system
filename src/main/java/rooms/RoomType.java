package rooms;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    FAMILY(4),
    CONF1(20),
    CONF2(30);

    private final int value;

    RoomType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
