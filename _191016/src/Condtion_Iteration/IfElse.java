package Condtion_Iteration;

public class IfElse {
	public static void main(String[] args) {
		int value = 10;
		if (value > 10) {
			System.out.println("value는 10보다 크다.");
		}
		System.out.println("프로그램 종료");

		if ((value % 2) == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

}
