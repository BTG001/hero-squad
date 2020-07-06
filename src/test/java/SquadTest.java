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

    @Test
    public void getsCause() {
        Squad squad = new Squad(7,"Justice League", "Safeguard People");
        assertEquals("Safeguard People", squad.getCause());
    }
    @After
    public void tearDown() {
        Squad.clear();
    }

    @Test
    public void getsId() {
        Squad squad = new Squad(7,"Justice League", "Safeguard People");
        assertEquals(1, squad.getId());
    }

    @Test
    public void allSquadsContainSquads() {
        Squad group1 = new Squad(7,"Justice League", "Safeguard People");
        Squad group2 = new Squad(5, "Wakanda Forever", "Protecting Wakanda");
        assertEquals(true, Squad.getAll().contains(group1));
        assertEquals(true, Squad.getAll().contains(group2));
    }
}