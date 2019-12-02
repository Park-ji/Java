package variable;

public class Variable {
	public static void main(String[] args) {
		
		boolean bool = true;
		char ch = 'a';
		byte by = 1;
		short sh = 10;
		int in = 100;
		long lo = 1000;
		float fl = 0.1f; //default 값이 double 이므로 'f'라고 명시를 해주어야 float형태임을 인식함
		//float연산시 - 버림 발생
		double dou = 0.01;
		//변경
		bool = false;
		//bool = 1; 불가능
//		System.out.println(bool+","+ch+","+by+","+sh+","+in+","+lo+","+fl+","+dou);
//		System.out.println(bool);
//		System.out.println(ch);
//		System.out.println(by);
//		System.out.println(sh);
//		System.out.println(in);
//		System.out.println(lo);
//		System.out.println(fl);
//		System.out.println(dou);
//		
//		int a = 10; //10진수
//		int a8 = 012; //8진수
//		int a16 = 0xA; //16진수
//		System.out.println(a+" "+a8+" "+a16);
//		
//		long b= 11; //10진수
//		long b8 = 013; //8진수
//		long b16 = 0xB; //16진수
//		System.out.println(b+" "+b8+" "+b16);
		
		System.out.println(ch);
		ch = 65; //아스키코드(127까지 정의되어있음) => 1byte가 가질수 있는 양의 값 : 127까지
		System.out.println(ch);
	}

}
