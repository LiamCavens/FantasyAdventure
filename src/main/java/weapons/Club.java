package weapons;

public class Club extends Weapon implements Attackable {

    public Club(String name, int attackDamage) {
        super(name, attackDamage);
    }

    public String attackMotion() {
        return "Bash";
    }
}
