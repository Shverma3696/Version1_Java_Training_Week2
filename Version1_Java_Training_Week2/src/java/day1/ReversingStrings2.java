package day1;

import java.util.Arrays;

public class ReversingStrings2 {

	public static void main(String[] args) {

		System.out.println("Day 1 - Additional Task 1.2 - Reversing Strings");

		String[] wordList = {"Stressed", "Parts", "Straw", "Keep", "Wolf"};		
		
		for(int i = 0; i < wordList.length; i++) {
			
			String reversedWord = "";
			
			String currentWord = wordList[i];
			
			for(int j = currentWord.length() - 1; j >= 0; j--) {
				
				reversedWord = reversedWord + currentWord.charAt(j);

			}
			wordList[i] = reversedWord;
		}

		System.out.println(Arrays.toString(wordList));

	}

}
