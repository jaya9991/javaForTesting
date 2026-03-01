package logics;

public class UserLimit {

	public static void main(String[] args) {

		// transaction (any amount) ---- approval from user1 max 100-----approval from
		// user2 max 100------approved

		int money = 400;
		int limit = 100; // should be made static as it never changes

		UserLimit user = new UserLimit();
		user.getResult(money, limit);

	}

	public void getResult(int transaction, int userLimit) { // parametrize things that can change
		// int transaction = 150;
		// int user1Limit = 100;
		// int user2Limit= user1Limit;
		System.out.println("transation initiated for:   " + transaction);

		if (transaction <= userLimit) {

			System.out.println("user1 approved the transaction of:   " + transaction);

			userLimit -= transaction;

			System.out.println("user2 approved the transaction of:   " + transaction);

			System.out.println("Daily limit left of user1 and user2 is:    " + userLimit);

		} else if (transaction > userLimit) {

			System.out.println("On day 1 user1 approved:    " + userLimit);

			int pending = transaction - userLimit; // store the remaining amount that needs to be approved the next day

			System.out.println("Amount pending to be approved on day 2 is:   " + pending);

			  do {

				if (pending <= userLimit) {

					System.out.println("user1 approved the pending amount of:   " + pending);

					userLimit -= pending;

				} else if (pending > userLimit) {

					// System.out.println("Amount too large push to another day");
					System.out.println("On day 2 user1 approved another:  " + userLimit);

					int dayNextamount = pending - userLimit;

					System.out.println("Amount pending to be approved on next day is:   " + dayNextamount);
					// System.out.println("Pending amount of " + dayNextamount + " was approved");
                   
						
				} 
			  }
				while (pending < userLimit);
						 
			  
		}
	}
}


				/*
				 * if (day2amount <= user1Limit) {
				 * 
				 * System.out.println("user1 approved the pending amount of " + day2amount);
				 * 
				 * user1Limit -= day2amount;
				 * 
				 * } else if(day2amount > user1Limit) {
				 * 
				 * System.out.println("Amount too large push to another day"); } }
				 */
			
			  
		
	
	
		  
			
			 