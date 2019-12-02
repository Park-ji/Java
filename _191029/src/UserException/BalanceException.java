package UserException;

public class BalanceException extends Exception {
	BalanceException() {
		System.out.println("BalanceException ¹ß»ý");
	}
	BalanceException(String message){
		super(message);
	}

}
