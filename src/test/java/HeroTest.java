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

    @Test
    public void getsAgeInput() {
        Hero hero = new Hero("Shazam", 30, "Superhuman Strength", "Spell Casting Confusion");
        assertEquals(30, hero.getAge());
    }

    @Test
    public void getsSpecialPower() {
        Hero hero = new Hero("Shazam", 30, "Superhuman Strength", "Spell Casting Confusion");
        assertEquals("Superhuman Strength", hero.getSpecialPower());
    }

    @Test
    public void getsWeakness() {
        Hero hero = new Hero("Shazam", 30, "Superhuman Strength", "Spell Casting Confusion");
        assertEquals("Spell Casting Confusion", hero.getWeakness());
    }

    @After
    public void tearDown() throws Exception {
        Hero.clear();
    }

    @Test
    public void getsId() {
        Hero hero = new Hero("Shazam", 30, "Superhuman Strength", "Spell Casting Confusion");
        assertEquals(1, hero.getId());
    }
}