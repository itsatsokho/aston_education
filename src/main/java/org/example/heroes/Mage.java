package org.example.heroes;

import org.example.enemies.Enemy;

public class Mage extends Hero {
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println();
        System.out.println(getName() + " attack enemy with Fireball");
        int damage = 12;
        enemy.takeDamage(damage, this);
    }

    @Override
    public boolean isAlive() {
        return this.getHealth() > 0;
    }
}
