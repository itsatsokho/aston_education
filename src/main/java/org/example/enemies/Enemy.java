package org.example.enemies;

import org.example.Mortal;
import org.example.heroes.Hero;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void counterAttack(Hero hero){
        int damage = 5;
        hero.takeDamage(damage, this);
    }

    public void takeDamage(int damage, Hero hero){
        health = health - damage;
        System.out.println(isAlive() ?  getClass().getSimpleName() + " take " + damage + " damage from " + hero.getName() + ". " + health
                + " HP left. " : getClass().getSimpleName() + " take " + damage + " damage from "
                + hero.getName() + "." + getClass().getSimpleName() + " dead.");
        if (isAlive()){
            counterAttack(hero);
        }
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

}
