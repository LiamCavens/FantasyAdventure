package weapons;

public class Sword extends Weapon implements Attackable {

    public Sword(String name, int attackDamage) {
        super(name, attackDamage);
    }

    public String attackMotion() {
        return "Slash";
    }
}
