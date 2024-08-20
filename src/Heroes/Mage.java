package Heroes;

import Interfaces.Mortal;
import Weapons.DamageType;
import Weapons.MagicalWeapon;

public class Mage extends Hero{
    private static final int damageWithoutWeapon = 1;
    private static final int healthMax = 8;

    public Mage(String name) {
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

    public void equipWeapon(MagicalWeapon weapon){
        setWeapon(weapon);
    }

    @Override
    public String toString() {
        return "Mage " + getName();
    }
}
