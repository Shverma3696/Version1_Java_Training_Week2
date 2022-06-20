package day3;
import java.util.ArrayList;
import java.util.Arrays;

public class Day3 {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("violet");
		colors.add("indigo");
		colors.add("blue");
		colors.add("green");
		colors.add("yellow");
		colors.add("orange");
		colors.add("red");
		
		int i = 0;
		
		while(i < colors.size()) {
			if(colors.get(i).contains("e")) {
				System.out.println("remove --> " + colors.get(i));
				colors.remove(i); 
				 // after removing this element index changes
				i--;
			}
			i++;
		}
		
		System.out.println("after removeing colors --> " + Arrays.toString(colors.toArray()));
		
		System.out.println("--------------------------------------------------");
		
		String[] colors1 = {"violet", "indigo", "blue", "green", "yellow", "orange", "red"};
		
		int j = 0;
		
		while(j < colors1.length) {
			if(colors1[j].contains("e")) {
				System.out.println("replace --> " + colors1[j]);
				colors1[j] = " "; 
				 // after removing this element index changes
				j--;
			}
			j++;
		}
		
		System.out.println("after replacing colors --> " + Arrays.toString(colors1));
	}
	
}
