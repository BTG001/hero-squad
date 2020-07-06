import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {
    @Test
    public void checkIfItInstantiatesProperly() {
        Hero hero = new Hero("Shazam", 30, "Superhuman Strength", "Spell Casting Confusion");
        assertEquals(true, hero instanceof Hero);
    }

    @Test
    public void getsNameInput() {
        Hero hero = new Hero("Shazam", 30, "Superhuman Strength", "Spell Casting Confusion");
        assertEquals("Shazam", hero.getName());
    }
}