package weapons;

import interfaces.IDamage;

public class Axe extends Weapon implements Attackable, IDamage {

    public Axe(String name, int attackDamage) {
        super(name, attackDamage);
    }

    public String attackMotion() {
        return "Chop";
    }
}
