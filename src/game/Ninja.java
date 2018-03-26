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
        this.setAttackModifier(2);
        super.attack(character);
    }
    
    @Override
    public void healUp(){
        this.setHealUpModifier(20);
        super.healUp();
    }
    
    @Override
    public void special(Character character){
        // attack oppenent with reduced attackModifier and add amount of damage to own health
        if (this.getHealth() < 30 && this.getCounter() != 0){
            this.setAttackModifier(1.8);
            Random random = new Random();
            double preAttack = character.getHealth();
            character.setHealth(character.getHealth() - (random.nextDouble() * 10 * this.getAttackModifier()));
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