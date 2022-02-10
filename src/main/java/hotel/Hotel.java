package hotel;

import guest.Guest;
import room.Room;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.DiningRoom;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public HashMap<String, DiningRoom> getDiningRooms() {
        return this.diningRooms;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return this.bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return this.conferenceRooms;
    }


//    public void addRooms(Room... rooms) {
//
//        for (Room room  : rooms ) {
//            if (room.getClass().toString() == "Bedroom") {
//                this.bedrooms.add(room);
//            } else {
//                this.conferenceRooms.add(room);
//            }
//        }
//
//    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }


    public void checkInGuest(Guest guest, Room room) {
        room.addGuest(guest);
    }

    public void checkOutGuest(Guest guest, Room room) {
        room.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights) {
        return new Booking(bedroom, numberOfNights);
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.put(diningRoom.getName(), diningRoom);
    }
}
