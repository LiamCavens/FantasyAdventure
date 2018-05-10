import org.junit.Before;
import org.junit.Test;
import players.Dwarf;
import players.Knight;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Knight knight;
    Dwarf dwarf;
    Sword sword;
    Axe axe;


    @Before
    public void before() {
        sword = new Sword("Chillrend", 15);
        knight = new Knight("King Jamiroquai", 100, sword, true);
        axe = new Axe("Hatchet", 12);
        dwarf = new Dwarf("Gimli", 120, axe);
    }

    @Test
    public void getName() {
        assertEquals("King Jamiroquai", knight.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(100, knight.getHealth());
    }

    @Test
    public void hasArmour() {
        assertEquals(true, knight.getArmour());
    }

    @Test
    public void getArmourHealth() {
        assertEquals(50, knight.getArmourHealth());
    }

    @Test
    public void canAttack() {
        knight.attackPlayer(dwarf);
        assertEquals(105, dwarf.getHealth());
    }

    @Test
    public void noDamageHasArmour() {
        dwarf.attackPlayer(knight);
        assertEquals(100, knight.getHealth());
    }

    @Test
    public void takeArmourDamage() {
        dwarf.attackPlayer(knight);
        assertEquals(38, knight.getArmourHealth());
    }

    @Test
    public void canDestroyArmour() {
        dwarf.attackPlayer(knight);
        dwarf.attackPlayer(knight);
        dwarf.attackPlayer(knight);
        dwarf.attackPlayer(knight);
        dwarf.attackPlayer(knight);
        dwarf.attackPlayer(knight);
        assertEquals(88, knight.getHealth());
    }

    @Test
    public void changeWeapon() {
        knight.setWeapon(axe);
        assertEquals(axe, knight.getWeapon());
    }
}
