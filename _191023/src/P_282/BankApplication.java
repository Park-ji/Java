package P_282;

import java.util.Scanner;

public class BankApplication {
	static int idx=0;
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				createAccount();
			}
			else if(selectNo==2) {
				accountList();
			}
			else if(selectNo==3) {
				deposit();
			}
			else if(selectNo==4) {
				withdraw();
			}
			else if(selectNo==5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		
		String tmp = scanner.nextLine(); //개행문자 제거
		
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		
		
		System.out.print("계좌주 : ");
		String owner = scanner.nextLine();
		
		
		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt();
		
		Account account = new Account(ano, owner, balance);	
		accountArray[idx++] = account;
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}
	
	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		int len = accountArray.length;
		for(int i=0;i<len;i++) {
			if(accountArray[i]!=null) 
				System.out.println(accountArray[i].getAno()+"\t"+accountArray[i].getOwner()
						+"\t"+accountArray[i].getBalance());
		}
	}
	
	private static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		
		String tmp = scanner.nextLine();
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.print("예금액 : ");
		int balance = scanner.nextInt();	
		findAccount(ano).setBalance(balance);
		System.out.println("결과 : 예금이 성공되었습니다.");
		
	}
	private static void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		
		String tmp = scanner.nextLine();
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.print("출금액 : ");
		int balance = scanner.nextInt();
		
		findAccount(ano).setBalance(-balance);
		System.out.println("결과 : 출금이 성공되었습니다.");	
		
	}
	
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno() != null)
				if (ano.equals(accountArray[i].getAno())) {
					account = accountArray[i];
					break;
				}
		}
		return account;
	}

}
























