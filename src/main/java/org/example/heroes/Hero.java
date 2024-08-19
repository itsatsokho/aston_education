package org.example.heroes;

import org.example.enemies.Enemy;
import org.example.Mortal;

public abstract class Hero implements Mortal {
    private final String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage, Enemy enemy){
        health = health - damage;
        System.out.println(isAlive() ?  enemy.getClass().getSimpleName() + " counterattack " + this.name + " with " + damage + " damage. "
                + this.health + " HP left. " : "Enemy counterattack " + this.name
                + " with " + damage + " damage. " + this.name + " dead. Game over.");
    }
}
