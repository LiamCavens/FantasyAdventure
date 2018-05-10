package spells;

import interfaces.IDamage;

public class NorthKoreanNuclearStrike extends Spell implements Castable, IDamage {

    public NorthKoreanNuclearStrike(String name, int attackDamage, String element) {
        super(name, attackDamage, element);
    }

    public String cast() {
        return "Casts a nuke from the tunnels of a small north korean mining village. On impact the missile crumbles.";
    }
}
