package Heroes;

import Interfaces.Mortal;
import Weapons.DamageType;
import Weapons.WarriorWeapon;

public class Warrior extends Hero {
    private static final int damageWithoutWeapon = 2;
    private static final int healthMax = 15;
    public Warrior(String name) {
        super(name, healthMax);
    }

    @Override
    public void attackEnemy(Mortal target) {
        if(getWeapon() == null){
            System.out.println(this + " attacks " + target + " with bare hands!");
            target.takeDamage(damageWithoutWeapon, DamageType.BLUDGEONING);
        }
        else {
            System.out.println(this + " attacks " + target + " with " + getWeapon().toString());
            target.takeDamage(getWeapon().getDamage(), getWeapon().getDamageType());
        }
    }

    public void equipWeapon(WarriorWeapon weapon){
        setWeapon(weapon);
    }

    @Override
    public String toString() {
        return "Warrior " + getName();
    }
}
