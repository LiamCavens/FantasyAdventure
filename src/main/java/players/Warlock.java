package players;

import spells.Spell;
import weapons.Weapon;

public class Warlock extends Player {

    Spell spell;

    public Warlock(String name, int health, Weapon weapon, Spell spell) {
        super(name, health, weapon);
        this.spell = spell;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }
}