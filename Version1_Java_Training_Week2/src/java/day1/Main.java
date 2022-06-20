package day1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		Calculator c = new Calculator();

		System.out.println("Enter first number");
		int a = Integer.parseInt(scn.nextLine());

		System.out.println("Choose operation +, -, *, /");
		String op = scn.nextLine();

		System.out.println("Enter second number");
		int b = Integer.parseInt(scn.nextLine());

		if (op.equals("+")) {
			c.add(a, b);
		} else if (op.equals("-")) {
			c.subtract(a, b);
		} else if (op.equals("*")) {
			c.multiply(a, b);
		} else if (op.equals("/")) {
			c.divide(a, b);
		} else {
			System.out.println("invalid input.");
		}

	}

}
