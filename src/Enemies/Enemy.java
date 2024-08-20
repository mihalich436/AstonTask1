package Enemies;

import Interfaces.Mortal;
import Weapons.DamageType;

public abstract class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void takeDamage(int damage, DamageType damageType){
        health -= damage;
        System.out.println(this + " got damage " + damage + ". Heath left: " + health);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attackHero(Mortal target);
}
