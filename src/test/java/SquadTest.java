import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void checkIfItInstantiatesProperly() {
        Squad squad = new Squad(7,"Justice League", "Safeguard People");
        assertEquals(true, squad instanceof Squad);
    }

    @Test
    public void getsSize() {
        Squad squad = new Squad(7,"Justice League", "Safeguard People");
        assertEquals(7, squad.getSize());
    }

    @Test
    public void getsSquadName() {
        Squad squad = new Squad(7,"Justice League", "Safeguard People");
        assertEquals("Justice League", squad.getSquadName());
    }
}