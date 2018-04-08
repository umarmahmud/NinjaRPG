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
public class CpuLogic {
    
    public static void cpuLogic(Character cpu, Character player){
            if(cpu.specialActivated()){
                cpu.special(player);
            }
            else if (cpu.getHealth() < 15 && cpu.getHealthFood() > 0){
                if (player.getHealth() < 10){
                    cpu.attack(player);
                }
                else{
                    cpu.healUp();
                }
            }
            else{
                cpu.attack(player);
            }
    }
}