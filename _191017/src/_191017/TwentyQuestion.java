package _191017;

import java.util.Scanner;

public class TwentyQuestion {
	public static void main(String[] args) {
		int com = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		//System.out.print("���� �� �Է� : ");
		//int num = sc.nextInt();
		int my;
		
		while(true) {
			System.out.print("���Է�: ");
			my = sc.nextInt();
			if(my==com) {System.out.println("Correct");break;}
			else if(my<com) System.out.println("Up");
			else System.out.println("Down");			
		}
		
	}
}
