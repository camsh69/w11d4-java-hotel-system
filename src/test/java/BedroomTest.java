import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BedroomTest {
    Bedroom singleBedroom;

    @Before
    public void before() {
        singleBedroom = new Bedroom(RoomType.SINGLE, 1, 10.0);
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(1, singleBedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType() {
        assertEquals(RoomType.SINGLE, singleBedroom.getRoomType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, singleBedroom.getCapacity());
    }

    @Test
    public void guestsStartsEmpty() {
        assertTrue(singleBedroom.getGuests().isEmpty());
    }

    @Test
    public void canGetRate() {
        assertEquals(10.0, singleBedroom.getRate(), 0.0);
    }
}
