package Heroes;

import Weapons.DamageType;
import Weapons.Weapon;
import Interfaces.Mortal;

public abstract class Hero implements Mortal {
    private final String name;
    private Weapon weapon;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    protected void setWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(this + " equipped " + weapon);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Mortal target);

    @Override
    public void takeDamage(int damage, DamageType damageType) {
        health -= damage;
        System.out.println(this + " got damage " + damage + ". Heath left: " + health);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
