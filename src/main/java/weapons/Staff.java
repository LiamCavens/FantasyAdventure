package weapons;

import healingitems.Healable;
import interfaces.IDamage;

public class Staff extends Weapon implements Attackable, IDamage {

    public Staff(String name, int attackDamage) {
        super(name, attackDamage);
    }

    public String attackMotion() {
        return "You shall not pass!!!";
    }

    public String healing() {
        return "Waving my staff and making you feel goooooood";
    }
}
