package day1;

public class FruitsPrices {

	public static void main(String[] args) {

		System.out.println("Day 1 - Task 5 - Price of fruits");

		String fruit = "apple";

		switch (fruit) {
		case "orange":
			System.out.println("Oranges are 1.99 euros / KG.");
			break;
		case "banana":
			System.out.println("Banana's are 1.49 euros / KG.");
			break;
		case "apple":
			System.out.println("Apples are 2.99 euros / KG.");
			break;
		case "watermelon":
			System.out.println("Watermelon is 3.99 euros / KG.");
			break;
		case "peach":
			System.out.println("Peaches are 2.59 euros / KG.");
			break;
		default:
			System.out.println("The shopkeeper does not sell this fruit.");
			break;
		}

	}

}
