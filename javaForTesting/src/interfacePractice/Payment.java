package interfacePractice;

public interface Payment {
	
	public void transactionNumber();
	
	
	 public default void pay(int amount) {
		 
		 System.out.println("payment amount is: " +amount);
		 
	 }

}
