package weapons;

import interfaces.IDamage;

public class Sword extends Weapon implements Attackable, IDamage {

    public Sword(String name, int attackDamage) {
        super(name, attackDamage);
    }

    public String attackMotion() {
        return "Slash";
    }
}
