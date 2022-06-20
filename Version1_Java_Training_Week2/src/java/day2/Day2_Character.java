package day2;

public class Day2_Character {
	private String name;
	private int power;
	private String anime_name;
	
	Day2_Character(String passedName, int passedPower, String passedAnime_name) {
		this.name = passedName;
		this.power = passedPower;
		this.anime_name = passedAnime_name;
	}
	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public String getAnime_name() {
		return anime_name;
	}

	public void display() {
		System.out.println("Character Name --> " + this.name);
		System.out.println("Power --> " + this.power);
		System.out.println("Anime Name --> " + this.anime_name);
	}
	
}
