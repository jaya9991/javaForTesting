package logics;

public class SwitchCase {

	public void rollTheDice(int num) {

		switch (num) {
		case 1:
			System.out.println("you rolled 1");
			break;
		
		case 2:
			System.out.println("you rolled 2");
			break;
			
			
		case 3:
			System.out.println("you rolled 3");
			break;
			
		case 4:
			System.out.println("you rolled 4");
			break;
			
		case 5:
			System.out.println("you rolled 5");
			break;
			
		case 6:
			System.out.println("you rolled 6");
			break;
			
		default:
			System.out.println("STICK TO THE NUMBERS ON THE DICE PLEASE THANK YOU");
			break;
		}
	}
	
	public static void main(String[] args) {
		
		int number = 3;
		
		SwitchCase roll = new SwitchCase();
		roll.rollTheDice(number);
		
		
	}
	
}