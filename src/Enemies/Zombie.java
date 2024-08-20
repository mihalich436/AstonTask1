package Enemies;

import Interfaces.Mortal;
import Weapons.DamageType;

import java.util.Random;

public class Zombie extends Enemy{
    private static final int damage = 3;
    private static final int healthMax = 10;
    private boolean undiedAlready = false;
    public Zombie() {
        super(healthMax);
    }

    @Override
    public void attackHero(Mortal target) {
        System.out.println(this + " attacks " + target.toString());
        target.takeDamage(damage, DamageType.PIERCING);
    }

    private void undie(){
        undiedAlready = true;
        setHealth(healthMax/2);
        System.out.println(this + " rose with health " + getHealth());
    }

    @Override
    public void takeDamage(int damage, DamageType damageType){
        if (damageType == DamageType.LIGHT) {
            damage *= 2;
            System.out.println("Light damage doubled!");
        }
        super.takeDamage(damage, damageType);
        if (!isAlive() && !undiedAlready) {
            if (new Random().nextBoolean()) undie();
        }
    }

    @Override
    public String toString() {
        return "Zombie";
    }
}
