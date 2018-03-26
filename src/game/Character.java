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
public abstract class Character {
    
    private double health = 100;
    private boolean alive = true;
    private double attackModifier = 1;
    private double healUpModifier = 1;
    private int healthFood = 3;
    private int counter = 1;
    
    public void setHealth(double health){
        this.health = health;
    }
    
    public double getHealth(){
        return health;
    }
    
    public boolean isAlive() {
        if (this.health < 0){
            alive = false;
        }
        return alive;
    }

    public double getAttackModifier() {
        return attackModifier;
    }

    public void setAttackModifier(double attackModifier) {
        this.attackModifier = attackModifier;
    }

    public double getHealUpModifier() {
        return healUpModifier;
    }

    public void setHealUpModifier(double healUpModifier) {
        this.healUpModifier = healUpModifier;
    }

    public int getHealthFood() {
        return healthFood;
    }

    public void setHealthFood(int healthFood) {
        this.healthFood = healthFood;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
   
    // composition over inheritance
    
    public void attack(Character character){
        Random random = new Random();
        character.health = (character.health - (random.nextDouble() * 10 * this.attackModifier));
    }
    
    public void healUp(){
        if (this.healthFood != 0){
            Random random = new Random();
            this.health = (this.health + (random.nextDouble() * 10 * this.healUpModifier));
            this.healthFood -= 1;
        }else
        {
            System.out.println("Oh no, out of powerups!");
        }
    }
    
    abstract void special(Character character);
}