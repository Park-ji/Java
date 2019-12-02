package UserException;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000);
		System.out.println(account.getBalance());
		try{account.withdraw(20000);}
		catch(Exception e) { // = new BalanceException();
			e.printStackTrace();
		}
	}
}
