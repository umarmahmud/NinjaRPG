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
public class Ninja extends Character{
    
    public Ninja(){
        super();
    }
    
    @Override
    public void attack(Character character){
        this.setAttackModifier(1.2);
        super.attack(character);
    }
    
    @Override
    public void healUp(){
        this.setHealUpModifier(1.5);
        super.healUp();
    }
    
    @Override
        public void special(Character character) {
        // heal with increased healUp modifier (increase dependent on health)
        if (this.specialActivated()){
            if(this.getHealth() < 20){
                this.setHealUpModifier(3);
            }
            else{
                this.setHealUpModifier(2.8);
            }
            super.healUp();
            this.setCounter(this.getCounter() - 1);
        }
    }
}