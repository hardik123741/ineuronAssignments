package com.guesser;

import java.util.Scanner;

public class main {
	/*
	 * Game Features
	 * 
	 * 1 - if you enter number greater than 50 or less than 1 then it will ask you
	 * again.
	 * 
	 * 2 - if we have more than 1 winner then it will automatically restart the
	 * Game.
	 * 
	 * 
	 */

	public static void main(String args[]) {
		Umpire umpire = new Umpire();
		boolean flag = true;
		while (flag) {
			System.out.println("==================================================================================");
			System.out.println();
			System.out.println("Welcome to The Guesser Game");
			System.out.println();
			System.out.println("==================================================================================");
			flag = umpire.askNumbersFromPlayers();

		}

	}

}
