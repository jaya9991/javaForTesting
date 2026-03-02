package logics;

public class VotingEligibility {

	public static void main(String[] args) {
		
		
		VotingEligibility sample = new VotingEligibility();
		sample.getAge(20);
		
	}
		
		
		public void getAge(int age) { 
		//int age =10;;
		
	String eligibleAge	= (age>=18)? "You are eligible to vote" : "You are ineligible to vote";
	
	System.out.println(eligibleAge);
		
		

	}

}
