import org.junit.Before;
import org.junit.Test;
import rooms.ConferenceRoom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(RoomType.CONF1, "CONF 1");
    }

    @Test
    public void hasRoomType() {
        assertEquals(RoomType.CONF1, conferenceRoom.getRoomType());
    }

    @Test
    public void hasName() {
        assertEquals("CONF 1", conferenceRoom.getName());
    }
}
