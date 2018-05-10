import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class WeaponTest {
    Sword sword;

    @Before
    public void before() {
        sword = new Sword("Chillrend", 15);
    }

    @Test
    public void getName() {
        assertEquals("Chillrend", sword.getName());
    }

    @Test
    public void getAttackDamage() {
        assertEquals(15, sword.getAttackDamage());
    }
}
