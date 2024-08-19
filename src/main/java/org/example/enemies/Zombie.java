package org.example.enemies;

import org.example.heroes.Hero;

public class Zombie extends Enemy {
    private int resurrection = 1;

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void counterAttack(Hero hero){
        int damage = 4;
        hero.takeDamage(damage, this);

    }

    @Override
    public boolean isAlive() {
        if (getHealth() <= 0 && resurrection == 1){
            resurrection = 0;
            setHealth(50);
            System.out.println("---- " + getClass().getSimpleName() + " resurrected! ----");
        }
        return getHealth() > 0;
    }
}
