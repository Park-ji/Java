package variable;

public class Operation2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 6;
		System.out.println(-a);
		double da = 10.0;
		double db = 6.1;

		System.out.println(da + db);
		System.out.println(da - db);
		System.out.println((float)(da-db));
		System.out.println(da * db);
		System.out.println(da / db);
		System.out.println((float)(da/db));
		System.out.println(da % db);
		
		//실수의 계산은 오차범위가 존재하므로 
		//실수의 연산은 정수값으로 바꾼다음에 정수로 계산
		//ex, 10.0 => 10으로 (*10) 계산하고 나중에 10으로 나누면 ok
		
		a = 100; // da*10
		b = 61; // db*10
		
		System.out.println(a*b);
		System.out.println(a/b);
		
		System.out.println((a*b)/100);
		System.out.println(a/b); // 100으로 나눌필요 x
		
		
		//!, ~
		boolean bool = true;
		bool =!bool;
		System.out.println(bool);//논리 반전 연산자
		
		byte v1 = 1; // 0000 0001
		System.out.println(~v1); //비트 반전 연산자
		// 1111 1110 -> 0000 0001 -> 0000 0010 : -2
	}
}
