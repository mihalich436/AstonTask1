package Enemies;

import Interfaces.Mortal;
import Weapons.DamageType;

public class Lich extends Enemy{
    private static final int damage = 5;
    private static final int healthMax = 20;
    public Lich() {
        super(healthMax);
    }

    @Override
    public void attackHero(Mortal target) {
        System.out.println(this + " attacks " + target.toString());
        target.takeDamage(damage, DamageType.NECROTIC);
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
        return "Lich";
    }
}
