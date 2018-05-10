package healingitems;

public class HealingHerb extends HealingItem implements Healable {

    public HealingHerb(int healingPower) {
        super(healingPower);
    }

    public String healing() {
        return "Fling this in yer gub";
    }
}
