package game;

import java.util.Scanner;

public class InputScanner {

	// singleton scanner class
	
	private static Scanner scanner;
	
	// private constructor, can't create scanner object directly
	private InputScanner() {
	}
	
	public static Scanner getInstance() {
		// lazy instantiation
		if (scanner == null) {
		scanner = new Scanner(System.in);
		}
		return scanner;
	}
}
