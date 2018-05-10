package spells;

import interfaces.IDamage;

public class Fireball extends Spell implements Castable, IDamage {

    public Fireball(String name, int attackDamage, String element) {
        super(name, attackDamage, element);
    }

    public String cast() {
        return "Pelts enemy with fireball.";
    }
}
