package healingitems;

public abstract class HealingItem {

    int healingPower;

    public HealingItem(int healingPower) {
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }
}
