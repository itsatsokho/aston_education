package org.example;

import org.example.enemies.Enemy;
import org.example.heroes.Archer;
import org.example.heroes.Hero;
import org.example.heroes.Mage;
import org.example.heroes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior1 = new Warrior("Konan", 120);
        Hero archer = new Archer("Legolas", 80);
        Hero mage = new Mage("Dambldor", 80);
        Enemy enemy1 = new Enemy(100);
        Enemy enemy2 = new Enemy(100);
        Enemy enemy3 = new Enemy(100);
        warrior1.attackEnemy(enemy1);
        archer.attackEnemy(enemy2);
        mage.attackEnemy(enemy3);

    }
}