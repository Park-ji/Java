package Inheritance;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int choice = 0;
		double r = 0.0;  //�������̵�Ǿ��ִ� com
		
		System.out.print("���� ��(1:�ڽİ�ü ������:�θ�ü)�� �Է��ϼ��� :  ");
		choice = scanner.nextInt();
		System.out.print("���ϴ� ������ �� : ");
		r=scanner.nextDouble();
		Computer com = new Computer(choice,r);
		System.out.println(com.areaCircle(r));

	}
	

}
