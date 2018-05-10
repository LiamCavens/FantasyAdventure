package players;

import interfaces.IDamage;
import spells.Spell;
import weapons.Weapon;

public class Wizard extends Player {

    Spell spell;

    public Wizard(String name, int health, Weapon weapon, Spell spell) {
        super(name, health, weapon);
        this.spell = spell;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void castSpell(Player player){
        player.takeDamageFromSpell(spell);
    }
}
