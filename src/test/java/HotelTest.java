import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HotelTest {

    Bedroom singleBedroom;
    Bedroom tripleBedroom;
    ConferenceRoom conferenceRoom;
//    ConferenceRoom conf2;
    Hotel hotel;

    @Before
    public void before() {
        singleBedroom = new Bedroom(RoomType.SINGLE, 1);
        tripleBedroom = new Bedroom(RoomType.TRIPLE, 3);
        conferenceRoom = new ConferenceRoom(RoomType.CONF1, "CONF 1");
        hotel = new Hotel("Fawlty Towers");
        hotel.addBedroom(singleBedroom);
        hotel.addBedroom(tripleBedroom);
        hotel.addConferenceRoom(conferenceRoom);
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
}
