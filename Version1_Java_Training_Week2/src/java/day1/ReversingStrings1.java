package day1;

public class ReversingStrings1 {

	public static void main(String[] args) {

		System.out.println("Day 1 - Additional Task 1.1 - Reversing Strings");

		String sentence = "Are you as excited as I am?";

		String reversedSentence = "";

		String[] str = sentence.split(" ");

		int length_of_array = str.length;

		for (int i = length_of_array - 1; i >= 0; i--) {
			reversedSentence = reversedSentence + str[i] + " ";
		}

		System.out.println(reversedSentence);

	}

}
