package day4;
public class Day4 {

	public static void main(String[] args) {
		
		Animals tom = new Cat("Tom", "Meoww");
		
		tom.eat();
		tom.sleep();
		
//		Day4_Task1_Animals jerry = new Day4_Task1_Mamals("Brown");

		System.out.println("---------------------------------");
		
		((Cat) tom).eat();
		
		Cat tomsBrother = new Cat("Fin", "Meoww");
		
		tomsBrother.controlTemperature();
		tomsBrother.eat();
		tomsBrother.setFurColor("Black");
		System.out.println(tomsBrother.getFurColor());
		
		System.out.println("---------------------------------");
		
//		Day4_Task1_Platypus perry = new Day4_Task1_Platypus("Perry", "Dark Brown");
		
		Animals perrys = new Platypus("Perry", "Dark Brown");
		
//		perry.controlTemperature();
//		System.out.println(perry.laysEggs);
//		perry.eat();
//		perry.eggProperties();
//		perry.sleep();
//		perry.venomProperties();
		
		((Platypus) perrys).controlTemperature();
		System.out.println(((Platypus) perrys).laysEggs);
		perrys.eat();
		((Platypus) perrys).eggProperties();
		perrys.sleep();
		((Platypus) perrys).venomProperties();
	}

}
