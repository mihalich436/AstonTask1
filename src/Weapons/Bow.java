package Weapons;

public class Bow extends ArcherWeapon{
    private static final int damage = 6;
    public Bow() {
        super(damage, DamageType.PIERCING);
    }

    @Override
    public String toString() {
        return "Bow";
    }
}
