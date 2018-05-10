package spells;

import interfaces.IDamage;

public class LightningBolt extends Spell implements Castable, IDamage{

    public LightningBolt(String name, int attackDamage, String element) {
        super(name, attackDamage, element);
    }

    public String cast() {
        return "Zaps the enemy a belter.";
    }
}
