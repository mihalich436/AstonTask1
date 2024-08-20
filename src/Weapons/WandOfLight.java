package Weapons;

public class WandOfLight extends MagicalWeapon{
    private static final int damage = 6;
    public WandOfLight() {
        super(damage, DamageType.LIGHT);
    }

    @Override
    public String toString() {
        return "Wand Of Light";
    }
}
