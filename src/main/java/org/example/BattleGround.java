package org.example;

import org.example.enemies.Enemy;
import org.example.enemies.Vampire;
import org.example.enemies.Zombie;
import org.example.heroes.Archer;
import org.example.heroes.Hero;
import org.example.heroes.Mage;
import org.example.heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Hero archer = new Archer("Hawkeye", 100);
        Hero warrior = new Warrior("Konan", 120);
        Hero mage = new Mage("Dambldor", 90);
        Enemy enemy1 = new Zombie(100);
        Enemy enemy2 = new Vampire(90);
        Enemy enemy3 = new Zombie(105);
        Enemy enemy4 = new Vampire(80);
        Enemy enemy5 = new Zombie(70);
        Enemy enemy6 = new Vampire(100);
        while (archer.isAlive() && enemy1.isAlive()){
            archer.attackEnemy(enemy1);
        }
        while (archer.isAlive() && enemy2.isAlive()){
            archer.attackEnemy(enemy2);
        }
        while (warrior.isAlive() && enemy3.isAlive()){
            warrior.attackEnemy(enemy3);
        }
        while (warrior.isAlive() && enemy4.isAlive()){
            warrior.attackEnemy(enemy4);
        }
        while (mage.isAlive() && enemy5.isAlive()){
            mage.attackEnemy(enemy5);
        }
        while (mage.isAlive() && enemy6.isAlive()){
            mage.attackEnemy(enemy6);
        }
    }
}
