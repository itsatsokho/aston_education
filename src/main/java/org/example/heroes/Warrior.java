package org.example.heroes;

import org.example.enemies.Enemy;

public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println();
        System.out.println(getName() + " attack enemy with Sword");
        int damage = 8;
        enemy.takeDamage(damage, this);
    }

    @Override
    public boolean isAlive() {
        return this.getHealth() > 0;
    }
}
