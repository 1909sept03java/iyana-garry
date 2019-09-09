package com.revature.week1;

import java.util.Scanner;

public class Week1Challenge {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a word:");
		String start = scanner.nextLine();

		System.out.println("Enter another word:");
		String end = scanner.nextLine();

		try {
			if (start.length() == 8 && end.length() == 8) {
				genebank(start, end);
			}
		}
		catch(Exception e) {
			System.out.println("User input should be 8 characters long, respectively.");
		}
		try {
			char A = 65;
			char C = 67;
			char G = 71;
			char T = 84;
			
			for (int i = 0; i < start.length(); i++) {
				if (start.charAt(i) == A || start.charAt(i) == C || start.charAt(i) == G || start.charAt(i) == T && end.charAt(i) == A || end.charAt(i) == C || end.charAt(i) == G || end.charAt(i) == T) {
					genebank(start, end);
				}
			}
		}
		catch(Exception e) {
			System.out.println("User input should consist of the letters A, C, G and T.");
		}
		
		scanner.close();
	}

	static void genebank(String start, String end) {
		String[] bank = { "AACCGGTA", "AACCGCTA", "AAACGGTA", "AAACGGTT" };
		int banknum = 0;
		for (int i = 0; i < start.length(); i++) {
			for (int j = 0; i < bank.length; j++) {
				if (start.charAt(i) == bank[j].charAt(i) || end.charAt(i) == bank[j].charAt(i)) {
					banknum = banknum + 1;
				}
			}
		}
	}
}