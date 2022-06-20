package day4;

public abstract class Animals {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {;
		System.out.print("Animals is hungary.. Animal wants some food.");
	}
	
	public void sleep() {
		System.out.println("Animal is sleeping...Zzzzzzz");
	};
}
