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
public class Ronin extends Character{
    
    
    public Ronin() {
        super();
    }
    
    @Override
    public void attack(Character character){
        this.setAttackModifier(1.7);
        super.attack(character);
    }
    
    @Override
    public void healUp(){
        this.setHealUpModifier(.9);
        super.healUp();
    }
    
    @Override
        public void special(Character character) {
        // triple hit - 100% chance for 1 hit, 60% for 2 hits, 20% for 3 hits (decreased modifier)
        if (this.specialActivated()){
            this.setAttackModifier(1.5);
            Random random = new Random();
            int prob = 100;
            for (int i = 0; i < 3; i++){
                double number = random.nextDouble() * 100;
                if (number > 0 && number <= prob){
                    super.attack(character);
                    System.out.println("hit");
                }
                prob -= 40;
            }
            this.setCounter(this.getCounter() - 1);
        }
    }
}