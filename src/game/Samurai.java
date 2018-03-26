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
        this.setAttackModifier(1.5);
        super.attack(character);
    }
    
    @Override
    public void healUp(){
        this.setHealUpModifier(1.2);
        super.healUp();
    }
    
    @Override
    public void special(Character character){
        // attack oppenent with reduced attackModifier and add amount of damage to own health
        if (this.specialActivated()){
            this.setAttackModifier(1.1);
            Random random = new Random();
            double preAttack = character.getHealth();
            super.attack(character);
            double postAttack = character.getHealth();
            double healthStolen = preAttack - postAttack;
            this.setHealth(healthStolen + this.getHealth());
            this.setCounter(this.getCounter() - 1);
        }else
        {
            System.out.println("...!!!");
        }
    }
}