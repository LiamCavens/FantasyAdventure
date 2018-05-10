package weapons;

public abstract class Weapon {
    private String name;
    private int attackDamage;

    public Weapon(String name, int attackDamage) {
        this.name = name;
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }
}
