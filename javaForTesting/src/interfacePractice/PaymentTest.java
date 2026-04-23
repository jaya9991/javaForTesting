package interfacePractice;

public class PaymentTest {
	

	    public static void main(String[] args) {

	        Payment payment;

	        payment = new CardPayment();
	        payment.pay(100);

	        payment = new OnlinePayment();
	        payment.pay(200);
	    }
	}


