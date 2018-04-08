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

	public static Character playerGenerator() {
		// default character
		Character player = new Ninja();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose a character: 1. Ninja 2. Samurai 3. Ronin");
		String option = scanner.nextLine();
		switch (option) {
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

	public static Character cpuGenerator() {
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

	public static boolean gameOver(Character player, Character cpu) {
		return (!player.isAlive() || !cpu.isAlive());
	}

	// method for displaying game status
	public static void showFinalGameStatus(Character player, Character cpu) {
		if (!cpu.isAlive()) {
			System.out.println("CPU health: 0");
			System.out.println("Player health: " + player.getHealth());
			System.out.println("You win!");
		} else {
			System.out.println("CPU health: " + cpu.getHealth());
			System.out.println("Player health: 0");
			System.out.println("You lose!");
		}
	}

	public static void start() {
		Character player = playerGenerator();
		Character cpu = cpuGenerator();

		while (!gameOver(player, cpu)) {
			Scanner scanner = new Scanner(System.in);

			// Player's turn
			if (player.specialActivated() && player.getHealthFood() > 0) {
				System.out.println("Choose an option: 1. attack 2. heal 3. special");
			} else if (player.specialActivated() && player.getHealthFood() == 0) {
				System.out.println("Choose an option: 1. attack 3. special");
			} else if (player.getHealthFood() > 0) {
				System.out.println("Choose an option: 1. attack 2. heal");
			} else {
				System.out.println("Choose an option: 1. attack");
				// continue statement for auto execution
			}

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

			// perform gameOver check
			if (gameOver(player, cpu)) {
				showFinalGameStatus(player, cpu);
				break;
			}

			// CPU's turn
			CpuLogic.cpuLogic(cpu, player);

			// perform gameOver check
			if (gameOver(player, cpu)) {
				showFinalGameStatus(player, cpu);
				break;
			}

			System.out.println("CPU health: " + cpu.getHealth());
			System.out.println("Player health: " + player.getHealth());
		}
	}
}

