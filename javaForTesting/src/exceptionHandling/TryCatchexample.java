package exceptionHandling;

import java.io.IOException;

public class TryCatchexample {

	public static void main(String[] args) throws IOException{

		
			checkAge(15); 
		
			

	}

	
	
	public static void checkAge(int age) throws IOException { 
		if (age < 18) {
			throw new IOException("cannot vote");
		}
	}

}
