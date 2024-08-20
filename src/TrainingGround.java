import Enemies.Enemy;
import Enemies.Zombie;
import Heroes.Warrior;
import Weapons.Sword;

public class TrainingGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Bob");
        Sword sword = new Sword();
        warrior.equipWeapon(sword);
        System.out.println("Sword damage = " + sword.getDamage());
        Zombie zombie = new Zombie();
        while (zombie.isAlive() && warrior.isAlive()) {
            if(warrior.isAlive()) warrior.attackEnemy(zombie);
            if(zombie.isAlive()) zombie.attackHero(warrior);
        }
        if (warrior.isAlive()) System.out.println(warrior + " won");
        else System.out.println(zombie + " won");
    }
}
