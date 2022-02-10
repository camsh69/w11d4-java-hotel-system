import hotel.Booking;
import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookingTest {

    Hotel hotel;
    Bedroom singleRoom;
    Booking booking;

    @Before
    public void before() {
        hotel = new Hotel("Fawlty Towers");
        singleRoom = new Bedroom(RoomType.SINGLE, 1, 10.0);
        hotel.addBedroom(singleRoom);

        booking = hotel.bookRoom(singleRoom, 3);
    }

    @Test
    public void canBookRoom() {
        assertTrue(hotel.getBedrooms().contains(singleRoom));
        assertEquals(singleRoom, booking.getBedroom());
        assertEquals(3, booking.getNumberOfNights());
    }

    @Test
    public void calculateTotalBill() {
        assertEquals(30.0, booking.totalBill(), 0.0);
    }
}
