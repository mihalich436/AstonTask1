package Weapons;

public abstract class Weapon {
    private final int damage;
    private final DamageType damageType;

    public Weapon(int damage, DamageType damageType) {
        this.damage = damage;
        this.damageType = damageType;
    }

    public int getDamage() {
        return damage;
    }

    public DamageType getDamageType() {
        return damageType;
    }
}
