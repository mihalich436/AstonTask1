import Enemies.Enemy;
import Enemies.Lich;
import Enemies.Sceleton;
import Enemies.Zombie;
import Heroes.Archer;
import Heroes.Hero;
import Heroes.Mage;
import Heroes.Warrior;
import Weapons.Bow;
import Weapons.Sword;
import Weapons.WandOfLight;

import java.util.*;

public class BattleGround {
    public static void main(String[] args) {
        //create heroes team
        List<Hero> heroes = new ArrayList<>();
        Warrior warrior = new Warrior("Bob");
        Archer archer = new Archer("Jack");
        Mage mage = new Mage("Merlin");
        warrior.equipWeapon(new Sword());
        archer.equipWeapon(new Bow());
        mage.equipWeapon(new WandOfLight());
        heroes.add(warrior);
        heroes.add(archer);
        heroes.add(mage);
        System.out.println("Heroes team: " + heroes);
        //create enemies
        List<Enemy> enemies = new ArrayList<>();
        Zombie zombie = new Zombie();
        Lich lich = new Lich();
        Sceleton sceleton = new Sceleton();
        sceleton.equipWeapon(new Sword());
        enemies.add(zombie);
        enemies.add(lich);
        enemies.add(sceleton);
        System.out.println("Enemies: " + enemies);
        //fight
        LinkedList<Hero> aliveHeroes = new LinkedList<>(heroes);
        LinkedList<Enemy> aliveEnemies = new LinkedList<>(enemies);
        Random random = new Random();
        System.out.println("\nLet the battle begin!");
        while (!aliveHeroes.isEmpty() && !aliveEnemies.isEmpty()){
            //hero attacks
            Hero hero = aliveHeroes.pop();
            Enemy enemy = aliveEnemies.get(random.nextInt(aliveEnemies.size()));
            hero.attackEnemy(enemy);
            aliveHeroes.add(hero);
            if (!enemy.isAlive()) {
                System.out.println(enemy + " died");
                aliveEnemies.remove(enemy);
                if (aliveEnemies.isEmpty()) break;
            }
            //enemy attacks
            enemy = aliveEnemies.pop();
            hero = aliveHeroes.get(random.nextInt(aliveHeroes.size()));
            enemy.attackHero(hero);
            aliveEnemies.add(enemy);
            if (!hero.isAlive()) {
                System.out.println(hero + " died");
                aliveHeroes.remove(hero);
            }
        }
        if (aliveHeroes.isEmpty()) System.out.println("Heroes lost...");
        else System.out.println("Heroes won!");
    }
}
