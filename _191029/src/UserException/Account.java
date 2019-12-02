package UserException;

public class Account {
	private long balance;//�ܰ� �����ϴ� �ʵ� ��
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {//setBalance()
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceException{//�ؿ��� �߻��� BalanceException�� ������ �������� ���ؼ�~
		if(balance < money) {//error
			//System.out.println("�ܰ� �����մϴ�.");
			throw new BalanceException();
		}
		else {
			balance -= money;
		}
	}

}
