package logics;

public class Divisibility {

	public static void main(String[] args) {

		Divisibility dv = new Divisibility();
	boolean sample = 	dv.check(15);
		System.out.println(sample);
		
		
	}

	public boolean check(int number) {

		if (number%3 == 0 && number%5 == 0) {

			return true;

		} else {

		    return false;
		
		}
	}

}
