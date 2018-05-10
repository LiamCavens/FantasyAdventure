package spells;

public class Fireball extends Spell {

    public Fireball(String name, int attackDamage, String element) {
        super(name, attackDamage, element);
    }

    public String cast() {
        return "Pelts enemy with fireball.";
    }
}
