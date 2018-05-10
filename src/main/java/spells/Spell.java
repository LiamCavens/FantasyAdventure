package spells;

public abstract class Spell {
    private String name;
    private int attackDamage;
    private String element;

    public Spell(String name, int attackDamage, String element) {
        this.name = name;
        this.attackDamage = attackDamage;
        this.element = element;
    }

    public String getName() {
        return name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public String getElement() {
        return element;
    }
}
