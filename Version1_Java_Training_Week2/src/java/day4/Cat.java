package day4;

public class Cat extends Mamals {
	
	Cat(String name, String furColor) {
		super(name, furColor);
	}

	private String name;
	private String sound;
	
	public String getName() {
		return name;
	}
	
	public String getSound() {
		return sound;
	}
	
	@Override
	public void controlTemperature() {
		System.out.println("Cat wants some CocaCola to control temperature.");
	}
	
	@Override
	public void eat() {
		System.out.println(this.getName() + " the Cat wants some fish for dinner.");
	}

	public void setFurColor(String furColor) {
	}

}
