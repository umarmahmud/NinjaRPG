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
public class Samurai extends Character {

    public Samurai() {
        super();
    }
    
    @Override
    public void attack(Character character){
        this.setAttackModifier(5);
        super.attack(character);
    }
    
    @Override
    public void healUp(){
        this.setHealUpModifier(20);
        super.healUp();
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
        this.setCounter(this.getCounter() - 1);
    }

}
