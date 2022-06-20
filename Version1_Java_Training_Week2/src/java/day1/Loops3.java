package day1;

import java.util.Scanner;

public class Loops3 {

	public static void main(String[] args) {

		System.out.println("Day 1 - Task 6.3 - user input + loops");

		Scanner scn = new Scanner(System.in);

		while (true) {
			String s = scn.nextLine();

			if (s.equals("stop")) {
				break;
			} else {
				System.out.println("keep printing. type 'stop' to exit..");
			}
		}

		System.out.println("loop exited.....!!!");

	}

}
