package UserException;

public class BalanceException extends Exception {
	BalanceException() {
		System.out.println("BalanceException �߻�");
	}
	BalanceException(String message){
		super(message);
	}

}
