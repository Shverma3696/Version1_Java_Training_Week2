package day1;

import java.util.Scanner;

public class Loops2 {

	public static void main(String[] args) {

		System.out.println("Day 2 - Task 6.2 - user input + loops");

		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();

		int i = 1;
		while (i <= num) {
			System.out.println("The value of i is --> " + i);
			i++;
		}

	}

}
