package logics;

public class UserLimit {

	public static void main(String[] args) {

		// transaction (any amount) ---- approval from user1 max 100-----approval from
		// user2 max 100------approved

		int transaction = 350;
		int user1Limit = 100;
		// int user2Limit= user1Limit;
		
		System.out.println("transation initiated for " + transaction);
		if (transaction <= user1Limit) {

			System.out.println("user1 approved the transaction of " + transaction);

			user1Limit -= transaction;

			System.out.println("user2 approved the trancation of " + transaction);

			System.out.println("Left daily limit of user1 and user2 is  " + user1Limit);

		} else if (transaction > user1Limit) { 

			System.out.println("On day 1 user1 approved  " + user1Limit);
			int pending = transaction - user1Limit;

			System.out.println("Amount pending to be approved on day 2 is " + pending);

			do {

				if (pending <= user1Limit) {

					System.out.println("user1 approved the pending amount of " + pending);

					user1Limit -= pending;

				} else if (pending > user1Limit) {

					// System.out.println("Amount too large push to another day");
					System.out.println("On day 2 user1 approved another  " + user1Limit);

					int dayNextamount = pending - user1Limit;

					System.out.println("Amount pending to be approved on next day is " + dayNextamount);
				//	System.out.println("Pending amount of " + dayNextamount + " was approved");

				}

			} while (pending < 100);

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
		}
	}

}
