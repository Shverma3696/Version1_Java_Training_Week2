package day4;
public abstract class Mamals extends Animals{
	
	private String name;
	private String furColor;

	Mamals(String name, String furColor) {
		this.name = name;
		this.furColor = furColor;
	}

	public String getName() {
		return name;
	}

	public String getFurColor() {
		return furColor;
	}
	
	public abstract void controlTemperature();

}
