package interfacePractice;


public class OnlinePayment implements Payment {
	
	

	    @Override
	    public void pay(int amount) {
	        System.out.println("Paid " + amount + " using online payment");
	    }

		@Override
		public void transactionNumber() {
			
			System.out.println("transaction number is 5678");
			
		}
	}


