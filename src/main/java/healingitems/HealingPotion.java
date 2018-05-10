package healingitems;

public class HealingPotion extends HealingItem implements Healable {

    public HealingPotion(int healingPower) {
        super(healingPower = 25);
    }

    public String healing() {
        return "Tan this potion";
    }
}
