package game;

import java.util.Scanner;

public class InputScanner {

	// singleton scanner class
	
	private static Scanner _scanner;
	
	private InputScanner() {
		// scanner = new Scanner(System.in);
	}
	
	public static Scanner getInstance() {
		// lazy instantiation
		if (_scanner == null) {
		_scanner = new Scanner(System.in);
		}
		return _scanner;
	}
}
