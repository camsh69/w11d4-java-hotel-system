package rooms;

import room.Room;

public class DiningRoom extends Room {

    private String name;

    public DiningRoom(RoomType roomType, String name) {
        super(roomType);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
