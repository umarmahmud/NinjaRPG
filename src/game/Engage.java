/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Umar
 */
public class Engage {
    
     public static Character playerGen(){
        // default character
        Character player = new Ninja();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a character: 1. Ninja 2. Samurai, 3. Ronin");
        String option = scanner.nextLine();
        switch (option){
            case "1":
                player = new Ninja();
                break;
            case "2":
                player = new Samurai();
                break;
            case "3":
                player = new Ronin();
                break;
        }
        System.out.println(player);
        return player;
    }
    
    public static Character cpuGen(){
        // default character
        Character cpu = new Ninja();
        Random random = new Random();
        int option = random.nextInt(3);
        switch (option) {
            case 0:
                cpu = new Ninja();
                break;
            case 1:
                cpu = new Samurai();
                break;
            case 2:
                cpu = new Ronin();
                break;
        }
        System.out.println(cpu);
        return cpu;
    }
    
    public static void start(){
        
        Character player = playerGen();
        Character cpu = cpuGen();
        
        while (player.isAlive() && cpu.isAlive()){
            
            // Player's turn
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose an option: 1. attack 2. heal 3. special");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    player.attack(cpu);
                    break;
                case "2":
                    player.healUp();
                    break;
                case "3":
                    player.special(cpu);
                    break;
            }

            // CPU's turn
            CpuLogic.cpuLogic(cpu, player);
            
            System.out.println("CPU health: " + cpu.getHealth());
            System.out.println("Player health: " + player.getHealth());
            
            if (!cpu.isAlive()){
                System.out.println("You win!");
                break;
            }
            else if (!player.isAlive())
            {
                System.out.println("You lose!");
                break;
            }
            
            /*
            System.out.println("CPU health: " + cpu.getHealth());
            System.out.println("Player health: " + player.getHealth());
            */
        }
    }
    
}
