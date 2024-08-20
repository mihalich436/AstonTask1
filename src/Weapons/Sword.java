package Weapons;

public class Sword extends WarriorWeapon {
    private static final int damage = 5;
    public Sword() {
        super(damage, DamageType.SLASHING);
    }

    @Override
    public String toString() {
        return "Sword";
    }
}
