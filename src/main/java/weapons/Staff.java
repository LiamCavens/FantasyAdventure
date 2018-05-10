package weapons;

import healingitems.Healable;

public class Staff extends Weapon implements Attackable, Healable {

    int healingPower;

    public Staff(String name, int attackDamage, int healingPower) {
        super(name, attackDamage);
        this.healingPower = healingPower;
    }

    public String attackMotion() {
        return "You shall not pass!!!";
    }

    public String healing() {
        return "Waving my staff and making you feel goooooood";
    }

    public int getHealingPower() {
        return healingPower;
    }
}
