/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;

/**
 *
 * @author Umar
 */
public class Warrior extends Character {

    public Warrior() {
        super();
    }

    @Override
    public void attack(Character character) {
        this.setAttackModifier(1.8);
        Random random = new Random();
        character.setHealth(character.getHealth() - (random.nextDouble() * 10 * this.getAttackModifier()));
    }

    @Override
    public void healUp(Character character){
        if (this.getHealthFood() != 0){
            this.setHealUpModifier(.25);
            Random random = new Random();
            this.setHealth(this.getHealth() + (random.nextDouble() * 10 * this.getHealUpModifier()));
            this.setHealthFood(this.getHealthFood() - 1);
        }else
        {
            System.out.println("Oh no, out of powerups!");
        }
    }

    @Override
    public void special(Character character) {
        // triple hit - 100% chance for 1 hit, 66% for 2 hits, 33% for 3 hits
        Random random = new Random();
        int prob = 100;
        for (int i = 0; i < 3; i++){
            double number = random.nextDouble() * 100;
            if (number > 0 && number <= prob){
                this.attack(character);
                System.out.println("hit");
            }
            prob -= 33;
        }
    }

}
