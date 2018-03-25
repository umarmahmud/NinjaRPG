/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Umar
 */
public abstract class Character {
    /*
    public enum Disposition{
        GOOD, EVIL
    }
    */
    private double health = 100;
    private boolean alive = true;
    private double attackModifier;
    private double healUpModifier;
    private int healthFood = 3;
    private int counter = 1;
    public static boolean gameOver = false;
    
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
    
    /*
    public Disposition getDisposition() {
        return disposition;
    }

    public void setDisposition(Disposition disposition) {
        this.disposition = disposition;
    }
    */
    abstract void attack(Character character);
    abstract void healUp(Character character);
    abstract void special(Character character);
}