import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class HeroTest {
    @Test
    public void checkIfItInstantiatesProperly() {
        Hero hero = new Hero("Shazam", 30, "Superhuman Strength", "Spell Casting Confusion");
        assertEquals(true, hero instanceof Hero);
    }
}
