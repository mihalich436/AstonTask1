package Interfaces;

import Weapons.DamageType;

public interface Mortal {
    void takeDamage(int damage, DamageType damageType);
    boolean isAlive();
}
