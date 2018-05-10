package players;

import com.sun.org.apache.xpath.internal.operations.Bool;
import weapons.Weapon;

public class Knight extends Player {
    private Boolean armour;
    private int armourHealth;

    public Knight(String name, int health, Weapon weapon, Boolean armour) {
        super(name, health, weapon);
        this.armour = armour;
        this.armourHealth = 50;
    }

    public Boolean getArmour() {
        return armour;
    }

    public void setArmour(){
        if (this.armourHealth <= 0){
            this.armour = false;
        }
    }

    public int getArmourHealth() {
        return armourHealth;
    }

    @Override
    public void takeDamage(Weapon weapon){
        if (this.getArmour()) {
            this.armourHealth -= weapon.getAttackDamage();
            setArmour();
        } else {
            int result = getHealth() - weapon.getAttackDamage();
            setHealth(result);
        }
    }
}
