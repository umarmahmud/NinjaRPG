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
        this.setAttackModifier(3);
        super.attack(character);
    }
    
    @Override
    public void healUp(){
        this.setHealUpModifier(.45);
        super.healUp();
    }
    
    @Override
    public void special(Character character) {
        // to-do
        super.attack(character);
    }
    
}
