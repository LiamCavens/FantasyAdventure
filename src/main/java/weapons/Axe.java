package weapons;

public class Axe extends Weapon implements Attackable {

    public Axe(String name, int attackDamage) {
        super(name, attackDamage);
    }

    public String attackMotion() {
        return "Chop";
    }
}
