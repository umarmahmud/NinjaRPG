/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;

/**
 *
 * @author Umar
 */
public class FantasyRPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // character object's specials depend on disposition
        // balace speed, attack power and healing power for each character object
        // health for all players starts at 100
        // need a callback to signal when special is ready and healup not available

        // 
        // 
        
        // System.out.println(ninja.getHealth());
        // System.out.println(ninja.isAlive());
        // System.out.println(ninja.getAttackModifier()); -> 0.0
        
        /*
        Character myCharacter;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a character: 1. Ninja, 2. ");
        String option = scanner.nextLine();
        
        switch(option){
            case "1": 
                Ninja ninja = new Ninja();
                break;
            case "2":
                
                break;
        }
        */
        Ninja ninja = new Ninja();
        Warrior warrior = new Warrior();
        
        System.out.println(ninja.getHealth());
        warrior.special(ninja);
        System.out.println(ninja.getHealth());

        
        /*
        while (Character.gameOver != true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a character: 1. Ninja, 2. ");
            String option = scanner.nextLine();
        }
*/
        
        
    }
    
}
