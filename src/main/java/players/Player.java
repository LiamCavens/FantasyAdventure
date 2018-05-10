package players;

import weapons.Attackable;
import weapons.Weapon;

public abstract class Player {
    private String name;
    private int health;
    private Weapon weapon;

    public Player(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void takeDamage(Weapon weapon){
        this.health -= weapon.getAttackDamage();
    }

    public void attackPlayer(Player player){
        player.takeDamage(this.weapon);
    }
}
