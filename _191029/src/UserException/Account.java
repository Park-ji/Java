package UserException;

public class Account {
	private long balance;//잔고 관리하는 필드 값
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {//setBalance()
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceException{//밑에서 발생된 BalanceException을 밖으로 내보내기 위해서~
		if(balance < money) {//error
			//System.out.println("잔고가 부족합니다.");
			throw new BalanceException();
		}
		else {
			balance -= money;
		}
	}

}
