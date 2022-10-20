package com.assignments;

import java.util.Iterator;

public class Asssignment1_Patterns {

	public static void main(String argsp[]) {

		pattern1();
		System.out.println("============================================");

		pattern2();
		System.out.println("============================================");

		pattern3();
		System.out.println("============================================");
	
		pattern4();
		System.out.println("============================================");
		
		pattern5();

	}

	static void pattern1() {
		row: for (int row = 1; row <= 11; row++) {

			col: for (int col = 1; col <= 35; col++) {
				if (col == 1 || col == 35 || row == 1 || row == 11) {
					System.out.print(" * ");

				} else {
					if (row > 3 && row <= 8
							&& (col == 3 || col == 5 || col == 9 || col == 11 || col == 15 || col == 18 || col == 20
									|| col == 29 || col == 33 || (row == 5 && col == 6) || (row == 6 && col == 7)
									|| (row == 7 && col == 8) || (row == 4 && col == 12) || (row == 4 && col == 13)
									|| (row == 8 && col == 12) || (row == 8 && col == 13) || (row == 6 && col == 12)
									|| (row == 6 && col == 13) || (row == 8 && col == 16) || (row == 8 && col == 17)
									|| (row == 4 && col == 21) || (row == 4 && col == 22) || (row == 5 && col == 22)
									|| (row == 6 && col == 22) || (row == 5 && col == 22) || (row == 6 && col == 21)
									|| (row == 7 && col == 21) || (row == 8 && col == 22) || (row == 8 && col == 22)
									|| (row == 5 && col == 30) || (row == 6 && col == 31) || (row == 7 && col == 32)
									|| (row == 4 && col == 25) || (row == 8 && col == 25) || (row == 8 && col == 26)
									|| (row == 7 && col == 24) || (row == 6 && col == 24) || (row == 5 && col == 24)
									|| (row == 4 && col == 26) || (row == 5 && col == 27) || (row == 6 && col == 27)
									|| (row == 7 && col == 27))) {
						System.out.print(" * ");
					} else {
						System.out.print("   ");
					}
				}

			}
			System.out.println();
		}
	}

	static void pattern2() {

		for (int row = 1; row <= 4; row++) {

			for (int col = 1; col <= 4; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}

	}

	static void pattern3() {
		int currentSpces = 1;
		int currentSpacesPoint = 6;

		row: for (int row = 1; row <= 14; row++) {

			col: for (int col = 1; col <= 14; col++) {
				if ((row >= 8 && row != 14) && (col != 1 && col != 14)) {
					System.out.print("   ");
				} else {

					if (row >= 2 && row < 8) {

						for (int curr = 1; curr <= 14;) {

							if (curr == currentSpacesPoint + 1) {

								for (int curr1 = 1; curr1 <= currentSpces; curr1++) {
									System.out.print("   ");
								}
								currentSpacesPoint--;
								curr += currentSpces;
								currentSpces += 2;
							} else {
								System.out.print(" * ");
								curr++;
							}
						}
						break col;
					} else {
						System.out.print(" * ");
					}

				}
			}
			System.out.println();
		}

	}

	static void pattern4() {

		int spacepoint = 2;
		int total_Spaces = 12;

		row: for (int row = 1; row <= 8; row++) {

			col: for (int col = 1; col <= 14;) {
				if (row == 7 || row == 8) {

					System.out.print(" * ");
					col++;

				} else {
					if (col == spacepoint) {

						for (int cur = 1; cur <= total_Spaces; cur++) {
							System.out.print("   ");

						}
						col += total_Spaces;
						total_Spaces -= 2;
						spacepoint++;

					} else {

						System.out.print(" * ");
						col++;
					}
				}
			}

			System.out.println();
		}

	}

	static void pattern5() {
		int currStar = 6;
		row: for (int row = 1; row <= 14; row++) {

			col: for (int col = 1; col <= 14; col++) {
				if (row == 1 | row == 14) {
					System.out.print(" * ");

				} else {
					if (row <= 7 && currStar >= 0) {

						for (int star = 0; star < currStar; star++) {
							System.out.print(" * ");
						}
						if (currStar == 1) {
							currStar = 2;
							break col;
						}

						currStar--;
						break col;
					} else {
						for (int curr = 0; curr < currStar; curr++) {
							System.out.print(" * ");
						}
						currStar++;
						break col;

					}

				}

			}
			System.out.println();
		}

	}

}
