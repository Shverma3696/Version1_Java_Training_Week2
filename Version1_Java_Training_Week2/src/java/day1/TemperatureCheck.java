package day1;

public class TemperatureCheck {

	public static void main(String[] args) {

		System.out.println("Day1 - Task 2 - Temperature check.");

		int temperature = 25;

		if (temperature < 20) {
			System.out.println("It is not very hot today.");
		} else if (temperature >= 20 && temperature <= 35) {
			System.out.println("It is hot today.");
		} else {
			System.out.println("Seek a cool shaded place.");
		}

	}

}
