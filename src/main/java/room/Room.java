package room;

import guest.Guest;
import rooms.RoomType;

import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guests;
    private RoomType roomType;

    public Room(RoomType roomType) {
        this.capacity = roomType.getValue();
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }


    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
