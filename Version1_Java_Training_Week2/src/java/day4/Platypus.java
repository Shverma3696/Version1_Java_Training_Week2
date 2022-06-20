package day4;

public class Platypus extends Mamals implements Ibird, Ireptile {
	
	Platypus(String name, String furColor){
		super(name, furColor);
	}
	
	@Override
	public void venomProperties() {
		System.out.println("I am venomous.. Stay away...!!");
		
	}

	@Override
	public void controlTemperature() {
		System.out.println("Platypus is going for swim to cooldown.");
	}

	public void eggProperties() {
		System.out.println("takes 28 days to hatch. not good for eating.");
		
	}
	
	@Override
	public void eat() {
		System.out.println("Platypus is hungary..");
	}

}
