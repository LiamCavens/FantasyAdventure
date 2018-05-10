package weapons;

import interfaces.IDamage;

public class Club extends Weapon implements Attackable, IDamage {

    public Club(String name, int attackDamage) {
        super(name, attackDamage);
    }

    public String attackMotion() {
        return "Bash";
    }
}
