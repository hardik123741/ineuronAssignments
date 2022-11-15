package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StringAssignment {
	public static void main(String arsg[]) {
		remove_Duplicates("aHardika");
		System.out.println("==========================================");
		Print_Duplicates("Hardika");
		System.out.println("============================================");
		checkPalindrome("2552");
		System.out.println("==============================================");
		count_Things_In_String("HArdik@");

		System.out.println("=================================================");
		System.out.println("checking anagram is " + check_Anagram("bat", "tab"));

		System.out.println("=================================================");
		System.out.println("checking pangram is " + check_Pangram("bekjfwbwfe"));
		System.out.println("=================================================");
		System.out.println(check_All_Unique_Characters("hardika"));
		System.out.println("=================================================");
		System.out.println(max_Occuring_Characters("Hardikadguddddd"));

	}

	static void remove_Duplicates(String args) {
		Set<Character> newWord = new LinkedHashSet<>();

		for (int i = 0; i < args.length(); i++) {

			newWord.add(args.charAt(i));
		}

		for (char temp : newWord) {
			System.out.print(temp);
		}
		System.out.println();
	}

	static void Print_Duplicates(String arg) {
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < arg.length(); i++) {

			if (list.contains(arg.charAt(i))) {
				System.out.print(arg.charAt(i));
			} else {
				list.add(arg.charAt(i));
			}
		}
		System.out.println();
	}

	static void checkPalindrome(String args) {
		boolean flag = true;
		int start = 0;
		int end = args.length() - 1;
		while (start < end) {

			if (args.charAt(start) != args.charAt(end)) {
				flag = false;
				break;
			}
			start++;
			end--;
		}
		if (flag == true) {
			System.out.println(args + "is palindrome");
		} else {
			System.out.println(args + "is not palindrome");
		}
	}

	static void count_Things_In_String(String args) {
		args = args.toLowerCase();
		int vowels = 0;
		int consonant = 0;
		int special_character = 0;

		for (int i = 0; i < args.length(); i++) {
			if (args.charAt(i) == 'a' || args.charAt(i) == 'e' || args.charAt(i) == 'i' || args.charAt(i) == 'o'
					|| args.charAt(i) == 'u') {
				vowels++;
			} else if (args.charAt(i) == 'b' || args.charAt(i) == 'h' || args.charAt(i) == 'm' || args.charAt(i) == 'r'
					|| args.charAt(i) == 'c' || args.charAt(i) == 'j' || args.charAt(i) == 'n' || args.charAt(i) == 's'
					|| args.charAt(i) == 'd' || args.charAt(i) == 'k' || args.charAt(i) == 'p' || args.charAt(i) == 't'
					|| args.charAt(i) == 'f' || args.charAt(i) == 'l' || args.charAt(i) == 'q' || args.charAt(i) == 'g'
					|| args.charAt(i) == 'v' || args.charAt(i) == 'w' || args.charAt(i) == 'x' || args.charAt(i) == 'y'
					|| args.charAt(i) == 'z') {

				consonant++;

			} else {
				special_character++;
			}

		}
		System.out.println("in  " + args + " total consonant are " + consonant);

		System.out.println("in  " + args + " total vowels are " + vowels);

		System.out.println("in  " + args + " total special letters  are " + special_character);

	}

	static boolean check_Anagram(String arg1, String arg2) {
		boolean flag = true;
		arg1 = arg1.toLowerCase();
		arg2 = arg2.toLowerCase();
		char[] ag1 = arg1.toCharArray();
		char[] ag2 = arg2.toCharArray();

		Arrays.sort(ag1);
		Arrays.sort(ag2);
		if (ag1.length != ag2.length) {
			return false;
		} else {
			for (int i = 0; i < ag1.length; i++) {

				if (ag1[i] == ag2[i]) {

					continue;
				} else {
					flag = false;
					break;

				}
			}
			return flag;

		}

	}

	static boolean check_Pangram(String args1) {
		boolean flag = true;
		for (char i = 'a'; i <= 'z'; i++) {

			if (!args1.contains(String.valueOf(i))) {

				flag = false;
				break;
			}
		}
		return flag;
	}

	static boolean check_All_Unique_Characters(String arg) {
		arg = arg.toLowerCase();
		boolean flag = true;
		l1: for (int i = 0; i < arg.length() - 1; i++) {

			l2: for (int j = i + 1; j < arg.length(); j++) {
				if (arg.charAt(i) == arg.charAt(j)) {

					flag = false;
					break l1;
				}
			}
		}

		return flag;
	}

	static char max_Occuring_Characters(String arg) {
		arg = arg.toLowerCase();
		int previousMax = 0;
		char letter = ' ';

		for (int i = 0; i < arg.length() - 1; i++) {
			int currMax = 0;
			for (int j = i + 1; j < arg.length(); j++) {
				if (arg.charAt(i) == arg.charAt(j)) {
					currMax++;
				}
			}
			if (currMax > previousMax) {
				previousMax = currMax;
				letter = arg.charAt(i);

			}
		}
		return letter;
	}
}
