package players;

import healingitems.HealingItem;
import weapons.Weapon;

public class Cleric extends Player {

    private HealingItem healingItem;

    public Cleric(String name, int health, Weapon weapon, HealingItem healingItem) {
        super(name, health, weapon);
        this.healingItem = healingItem;
    }

    public void healPlayer(Player player){
        int result = player.getHealth() + healingItem.getHealingPower();
        player.setHealth(result);
    }

    public HealingItem getHealingItem() {
        return healingItem;
    }

    public void setHealingItem(HealingItem healingItem) {
        this.healingItem = healingItem;
    }
}
