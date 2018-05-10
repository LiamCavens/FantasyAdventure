import MythicalCreature.Dragon;
import healingitems.Healable;
import healingitems.HealingPotion;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Dwarf;
import players.Knight;
import players.Wizard;
import spells.NorthKoreanNuclearStrike;
import spells.Spell;
import weapons.Axe;
import weapons.Staff;
import weapons.Sword;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Knight knight;
    Dwarf dwarf;
    Sword sword;
    Sword sword2;
    Axe axe;
    Staff staff;
    Cleric cleric;
    HealingPotion potion;
    NorthKoreanNuclearStrike nkns;
    Wizard wizard;
    Dragon dragon;


    @Before
    public void before() {
        sword = new Sword("Chillrend", 15);
        sword2 = new Sword("Sean Bean", 50);
        knight = new Knight("King Jamiroquai", 100, sword, true);
        axe = new Axe("Hatchet", 12);
        dwarf = new Dwarf("Gimli", 120, axe);
        staff = new Staff("Master Branch", 10);
        potion = new HealingPotion(25);
        cleric = new Cleric("Mad Gandii", 100, staff, potion);
        nkns = new NorthKoreanNuclearStrike("NKNS", 150, "Uranium");
        wizard = new Wizard("Harry Potter", 75, sword, nkns);
        dragon = new Dragon("Steven", 250, 25);

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

    @Test
    public void clericCanHeal() {
        knight.attackPlayer(dwarf);
        knight.attackPlayer(dwarf);
        cleric.healPlayer(dwarf);
        assertEquals(115, dwarf.getHealth());
    }

    @Test
    public void wizardAttacks() {
        wizard.castSpell(dwarf);
        assertEquals(-30, dwarf.getHealth());
    }

    @Test
    public void hasProtector() {
        dwarf.getProtector(dragon);
        assertEquals(1, dwarf.getProtectors().size());
    }

    @Test
    public void protectorProtects() {
        dwarf.getProtector(dragon);
        wizard.castSpell(dwarf);
        System.out.println(nkns.cast());
        assertEquals(100, dwarf.getProtectorsHealth());
    }

    @Test
    public void protectorDies() {
        dwarf.getProtector(dragon);
        wizard.castSpell(dwarf);
        wizard.castSpell(dwarf);
        assertEquals(0, dwarf.getProtectors().size());
    }

    @Test
    public void canKillProtectorAndAttack() {
        dwarf.getProtector(dragon);
        knight.setWeapon(sword2);
        knight.attackPlayer(dwarf);
      //  assertEquals(70, dwarf.getHealth());
        assertEquals(200, dwarf.getProtectorsHealth());
    }
}
