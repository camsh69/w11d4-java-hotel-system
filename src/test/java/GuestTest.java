import guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Jane McDonald");
    }

    @Test
    public void hasName() {
        assertEquals("Jane McDonald", guest.getName());
    }

    @Test
    public void canChangeName() {
        guest.setName("Jane MacDonald");
        assertEquals("Jane MacDonald", guest.getName());
    }
}
