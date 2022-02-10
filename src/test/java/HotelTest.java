import guest.Guest;
import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.RoomType;

import static org.junit.Assert.*;

public class HotelTest {

    Bedroom singleBedroom;
    Bedroom tripleBedroom;
    ConferenceRoom conferenceRoom;
//    ConferenceRoom conf2;
    Hotel hotel;
    Guest guest;

    @Before
    public void before() {
        singleBedroom = new Bedroom(RoomType.SINGLE, 1);
        tripleBedroom = new Bedroom(RoomType.TRIPLE, 3);
        conferenceRoom = new ConferenceRoom(RoomType.CONF1, "CONF 1");
        hotel = new Hotel("Fawlty Towers");
        hotel.addBedroom(singleBedroom);
        hotel.addBedroom(tripleBedroom);
        hotel.addConferenceRoom(conferenceRoom);
        guest = new Guest("Juan McDonaldez");
    }

    @Test
    public void hasName() {
        assertEquals("Fawlty Towers", hotel.getName());
    }

    @Test
    public void canAddBedroom() {
        Bedroom doubleBedroom = new Bedroom(RoomType.DOUBLE, 2);
        hotel.addBedroom(doubleBedroom);
        assertTrue(hotel.getBedrooms().contains(doubleBedroom));
    }

    @Test
    public void canAddConferenceRoom() {
        ConferenceRoom biggerConferenceRoom = new ConferenceRoom(RoomType.CONF2, "CONF 2");
        hotel.addConferenceRoom(biggerConferenceRoom);
        assertTrue(hotel.getConferenceRooms().contains(biggerConferenceRoom));
    }

    @Test
    public void canCheckInGuest() {
        hotel.checkInGuest(guest, singleBedroom);
        assertTrue(singleBedroom.getGuests().contains(guest));
    }

    @Test
    public void canCheckOutGuest() {
        hotel.checkInGuest(guest, tripleBedroom);
        assertTrue(tripleBedroom.getGuests().contains(guest));
        hotel.checkOutGuest(guest, tripleBedroom);
        assertFalse(tripleBedroom.getGuests().contains(guest));
    }
}
