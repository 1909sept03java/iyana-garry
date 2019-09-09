package com.revature.week1;

import java.util.Scanner;

public class Week1Challenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		String start = scanner.nextLine();
		
		System.out.println("Enter another word:");
		String end = scanner.nextLine();
		
		genebank(start, end);
		scanner.close();
	}
	static void genebank(String start, String end) {
		for (int i = 0; i < start.length(); i++) {
			if (start.charAt(i) == end.charAt(i)) {
				StringBuilder bank = new StringBuilder();
				bank.insert(0, start.charAt(i));
			}
		}
	}
}