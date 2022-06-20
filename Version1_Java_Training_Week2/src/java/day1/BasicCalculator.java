package day1;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {

		System.out.println("Day 1 - Task 4 - User input + basic calculator");

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter first number");
		int a = Integer.parseInt(scn.nextLine());

		System.out.println("Choose operation +, -, *, /, %, ^(pow)");
		String op = scn.nextLine();

		System.out.println("Enter second number");
		int b = Integer.parseInt(scn.nextLine());

		if (op.equals("+")) {
			System.out.println(a + " + " + b + " = " + (a + b));
		} else if (op.equals("-")) {
			System.out.println(a + " - " + b + " = " + (a - b));
		} else if (op.equals("*")) {
			System.out.println(a + " x " + b + " = " + (a * b));
		} else if (op.equals("/")) {
			System.out.println(a + " / " + b + " = " + (a / b));
		} else if (op.equals("%")) {
			System.out.println(a + " % " + b + " = " + (a % b));
		} else if (op.equals("^")) {
			System.out.println(a + " to the powwer of " + b + " = " + (Math.pow(a, b)));
		} else {
			System.out.println("invalid input.");
		}

	}

}
