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
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("--------------------------------------");
			System.out.print("����> ");
			
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
		System.out.println("���α׷� ����");
	}
	
	private static void createAccount() {
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");
		
		String tmp = scanner.nextLine(); //���๮�� ����
		
		System.out.print("���¹�ȣ : ");
		String ano = scanner.nextLine();
		
		
		System.out.print("������ : ");
		String owner = scanner.nextLine();
		
		
		System.out.print("�ʱ��Աݾ� : ");
		int balance = scanner.nextInt();
		
		Account account = new Account(ano, owner, balance);	
		accountArray[idx++] = account;
		System.out.println("��� : ���°� �����Ǿ����ϴ�.");
	}
	
	private static void accountList() {
		System.out.println("------");
		System.out.println("���¸��");
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
		System.out.println("����");
		System.out.println("------");
		
		String tmp = scanner.nextLine();
		System.out.print("���¹�ȣ: ");
		String ano = scanner.nextLine();
		System.out.print("���ݾ� : ");
		int balance = scanner.nextInt();	
		findAccount(ano).setBalance(balance);
		System.out.println("��� : ������ �����Ǿ����ϴ�.");
		
	}
	private static void withdraw() {
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");
		
		String tmp = scanner.nextLine();
		System.out.print("���¹�ȣ: ");
		String ano = scanner.nextLine();
		System.out.print("��ݾ� : ");
		int balance = scanner.nextInt();
		
		findAccount(ano).setBalance(-balance);
		System.out.println("��� : ����� �����Ǿ����ϴ�.");	
		
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
























