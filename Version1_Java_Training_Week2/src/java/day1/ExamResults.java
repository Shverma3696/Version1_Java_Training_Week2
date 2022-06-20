package day1;

public class ExamResults {

	int physics, chemistry, biology, total;
	float percentage;

	ExamResults(int phy, int chem, int bio) {
		this.physics = phy;
		this.chemistry = chem;
		this.biology = bio;
		this.total = phy + chem + bio;
		this.percentage = (total * 100) / 450;
	}

	public void display() {
		System.out.println("Physics = " + physics);
		System.out.println("Chemistry = " + chemistry);
		System.out.println("Biology = " + biology);
		System.out.println("Total = " + total);
		System.out.println("Percentage = " + percentage);
	}

	public void checkFailPass() {
		if (percentage >= 60) {
			System.out.println("Over all result = Pass");
		} else {
			System.out.println("Over all result = Fail");
		}
	}

	public static void main(String[] args) {

		System.out.println("Day 1 - Additional Task 3 - Exam Results");

		ExamResults stud1 = new ExamResults(115, 110, 120);

		stud1.display();

		stud1.checkFailPass();

	}

}
