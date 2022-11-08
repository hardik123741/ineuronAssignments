package com.guesser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Umpire {
	Scanner sc = new Scanner(System.in);
	private List<Player> list = new ArrayList<>();

	Guesser guesser = new Guesser();

	public boolean askNumbersFromPlayers() {

		System.out.println("Please Enter Guesser Name :");

		guesser.setGuesser_Name(sc.next());

		boolean flag1 = true;

		while (flag1) {
			System.out.println("Please Guess The Number Between 1 to 50");

			int number = sc.nextInt();

			if (number > 50 || number < 0) {

				System.out.println("You Have Entered Wrong Number");
				System.out.println();
			} else {
				guesser.setNumber(number);
				flag1 = false;
			}
		}
		for (int i = 0; i < 3;) {
			boolean flag = true;
			System.out.println(" Player " + (i + 1) + " Please Enter Your Name : ");

			String name = sc.next();

			Player p = new Player(name);
			while (flag) {
				System.out.println(p.getPlayer_Name() + " Please Enter Your Number Between 1 To 50 : ");

				int number = sc.nextInt();

				if (number > 50 || number < 1) {
					System.out.println("You have Entered Wrong Number");
				} else {
					p.setNumber(number);

					list.add(p);
					flag = false;
					i++;
				}
			}
		}

		boolean renewGame = check_Winner();
		if (renewGame == true) {

			list.clear();

		}
		return renewGame;
	}

	public boolean check_Winner() {
		boolean winner_Found = false;
		boolean renewGame = false;
		List<String> WinnerNames = new ArrayList<>();
		for (Player p : list) {

			if (p.getNumber() == guesser.getNumber()) {

				WinnerNames.add(p.getPlayer_Name());
				winner_Found = true;
			}

		}

		if (winner_Found == false) {

			System.out.println("Sorry All Player Guessed Wrong Number ");

			renewGame = true;

		} else {
			if (WinnerNames.size() > 1) {

				System.out.println("Game Has Been tied Between  =>  " + WinnerNames);
				renewGame = true;
			} else {

				System.out.println("The Winner is  " + WinnerNames);

			}

		}
		return renewGame;
	}

}
