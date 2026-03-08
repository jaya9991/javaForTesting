package logics;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
	
		Scanner sample = new Scanner(System.in);
		
		System.out.println("what number have you guessed   ");
		int number = sample.nextInt();
		
		if(number>50) {
			
			System.out.println("guess lower");
			sample.nextInt();
			
		}
		
		else if(number<50) {
			
			System.out.println("guess higher");
			sample.nextInt();
			
		}
		
		else {
			
			System.out.println("you got it the number was 50!!");
		}
		
		

	}

}
