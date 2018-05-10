import org.junit.Before;
import org.junit.Test;
import spells.Fireball;

import static org.junit.Assert.assertEquals;

public class SpellTest {
    Fireball fireball;

    @Before
    public void before() {
        fireball = new Fireball("Fireball", 12, "Fire");
    }

    @Test
    public void getName() {
        assertEquals("Fireball", fireball.getName());
    }

    @Test
    public void getAttackDamage() {
        assertEquals(12, fireball.getAttackDamage());
    }

    @Test
    public void getElement() {
        assertEquals("Fire", fireball.getElement());
    }

    @Test
    public void canCast() {
        assertEquals("Pelts enemy with fireball.", fireball.cast());
    }
}
