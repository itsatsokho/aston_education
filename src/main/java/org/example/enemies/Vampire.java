package org.example.enemies;

import org.example.heroes.Hero;

public class Vampire extends Enemy {

    public Vampire(int health) {
        super(health);
    }

    @Override
    public void counterAttack(Hero hero){
        int damage = 7;
        hero.takeDamage(damage, this);
        double vampirism = damage * 0.5;
        double hp = getHealth() + vampirism;
        System.out.println("Vampire restore " + vampirism + " HP from attack. Now he has " + hp + " HP.");
    }
}
