package interfacePractice;

public class CardPayment implements Payment {
	

	    @Override
	    public void pay(int amount) {
	        System.out.println("Paid " + amount + " using  Card");
	    }

		@Override
		public void transactionNumber() {
			
			System.out.println("the transaction number is 1234");
			
		}
	}


