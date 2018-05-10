package spells;

public class LightningBolt extends Spell {

    public LightningBolt(String name, int attackDamage, String element) {
        super(name, attackDamage, element);
    }

    public String cast() {
        return "Zaps the enemy a belter.";
    }
}
