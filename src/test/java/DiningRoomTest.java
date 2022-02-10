import org.junit.Before;
import org.junit.Test;
import rooms.DiningRoom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before() {
        diningRoom = new DiningRoom(RoomType.DININGROOM, "Comedor");
    }

    @Test
    public void hasName() {
        assertEquals("Comedor", diningRoom.getName());
    }
}
