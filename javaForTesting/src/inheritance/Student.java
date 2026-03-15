package inheritance;

public class Student extends Person {

	void displayStudent() {
		System.out.println("This is a student.");
	}

	public static void main(String[] args) {
	        Student s = new Student();

	        s.displayPerson();   // inherited method
	        s.displayStudent();  // student method
}
	
}
