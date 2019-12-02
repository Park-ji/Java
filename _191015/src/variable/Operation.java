package variable;

public class Operation {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int result = 0;

		result = a + b;
		System.out.println(result);

		result = a - b;
		System.out.println(result);

		result = a * b;
		System.out.println(result);

		result = b / a;
		System.out.println(result);

		// 나누기 연산시 조심해야합니다!
		// 나누려고 하는 수를 0? error!

		result = a % 3; // 나머지 연산
		System.out.println(result);

		// 대입연산자: =,+=,-=,*=,/=....
		a += 10;
		System.out.println(a);
		a /= 10;
		System.out.println(a);
		
		// 증감연산자 : ++, -- --> ++a vs a++
		a++; //a=a+1
		System.out.println(a);
		a--; //a=a-1
		System.out.println(a);
		
		System.out.println(++a);
		System.out.println(--a);
		
		//삼항연산자
		int n1 = 10;
		int n2 = 0;
		n2 = (n1==0)?1:2;
		System.out.println("\n"+n2);
		

	}

}
