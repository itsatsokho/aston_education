package org.example.heroes;

import org.example.enemies.Enemy;

public class Archer extends Hero {

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println();
        System.out.println(getName() + " attack enemy with Bow");
        int damage = 10;
        enemy.takeDamage(damage, this);
    }

    @Override
    public boolean isAlive() {
        return this.getHealth() > 0;
    }
}
