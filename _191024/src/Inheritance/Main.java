package Inheritance;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int choice = 0;
		double r = 0.0;  //오버라이드되어있는 com
		
		System.out.print("선택 값(1:자식객체 나머지:부모객체)을 입력하세요 :  ");
		choice = scanner.nextInt();
		System.out.print("원하는 반지름 값 : ");
		r=scanner.nextDouble();
		Computer com = new Computer(choice,r);
		System.out.println(com.areaCircle(r));

	}
	

}
