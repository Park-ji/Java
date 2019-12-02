package P_282;


public class Account {
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	private String ano;
	private String owner;
	private int balance;
	
	Account(){}
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {return ano;}
	public void SetAno(String ano) {this.ano = ano;}
	public String getOwner() {return owner;}
	public void SetOwner(String owner) {this.owner = owner;}
	
	void setBalance(int balance) {
		//if(balance>=MIN_BALANCE && balance<=MAX_BALANCE) this.balance = balance;
		this.balance += balance;
		
	}
	int getBalance() {
		return balance;
	}

}
