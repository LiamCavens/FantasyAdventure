package players;

import MythicalCreature.MythicalCreature;
import interfaces.IDamage;
import spells.Spell;
import weapons.Attackable;
import weapons.Weapon;

import java.util.ArrayList;

public abstract class Player {
    private String name;
    private int health;
    private Weapon weapon;
    private ArrayList<MythicalCreature> protectors;

    public Player(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.protectors = new ArrayList<>();
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

    public ArrayList<MythicalCreature> getProtectors() {
        return protectors;
    }

//    public void takeDamage(Weapon weapon){
//        this.health -= weapon.getAttackDamage();
//    }

    public void protectorDies() {
        this.protectors.remove(0);
    }

    public void takeDamage(Weapon weapon){
        if (getProtectors().size() > 0){

            while (protectors.get(0).getHealth() > 0) {

                int result = this.protectors.get(0).getHealth() - weapon.getAttackDamage();
                this.protectors.get(0).setHealth(result);

                if (this.protectors.get(0).getHealth() <= 0) {
                    protectorDies();
                }
            }

        }
    }

    public void takeDamageFromSpell(Spell spell) {
        int i = getProtectors().size();
        ArrayList<MythicalCreature> deedprotectors = new ArrayList<>();


        if (i > 0) {
            if (protectors.get(0).getHealth() > 0) {

                int result = this.protectors.get(0).getHealth() - spell.getAttackDamage();
                this.protectors.get(0).setHealth(result);

                if (this.protectors.get(0).getHealth() <= 0) {
                    deedprotectors.add(protectors.get(0));
                    protectorDies();
                }
            }
        }

    }


    public void attackPlayer(Player player){
        player.takeDamage(this.weapon);
    }

    public void getProtector(MythicalCreature mythicalCreature){
        this.protectors.add(mythicalCreature);
    }

    public int getProtectorsHealth(){
        return this.protectors.get(0).getHealth();
    }
}
