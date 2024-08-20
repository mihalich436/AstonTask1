package Enemies;

import Interfaces.Mortal;
import Weapons.DamageType;
import Weapons.WarriorWeapon;

public class Sceleton extends Enemy{
    private static final int damageWithoutWeapon = 2;
    private static final int healthMax = 10;
    private WarriorWeapon weapon;

    public Sceleton() {
        super(healthMax);
    }

    @Override
    public void attackHero(Mortal target) {
        if(weapon == null){
            System.out.println(this + " attacks " + target + " with bare hands!");
            target.takeDamage(damageWithoutWeapon, DamageType.BLUDGEONING);
        }
        else {
            System.out.println(this + " attacks " + target + " with " + weapon);
            target.takeDamage(weapon.getDamage(), weapon.getDamageType());
        }
    }

    public void equipWeapon(WarriorWeapon weapon){
        this.weapon = weapon;
        System.out.println(this + " equipped " + weapon);
    }

    @Override
    public void takeDamage(int damage, DamageType damageType) {
        if (damageType == DamageType.LIGHT) {
            damage *= 2;
            System.out.println("Light damage doubled!");
        }
        super.takeDamage(damage, damageType);
    }

    @Override
    public String toString() {
        return "Sceleton";
    }
}
