
public class Example_T {
	public static void main(String[] args) {
		int money = 66720;
//		//int n1 = money / 50000;
//		//money %= 50000;
//		System.out.println(n1);
//		int n2 = money / 10000;
//		//money %= 10000;
//		//%=대신 그냥 n2 = (money%50000)/10000하면 한줄로 됨
//		System.out.println(n2);
//		int n3 = money / 5000;
//		//money %= 5000;
//		System.out.println(+n3);
//		int n4 = money / 1000;
//		//money %= 1000;
//		System.out.println(n4);
//		int n5 = money / 500;
//		//money %= 500;
//		System.out.println(n5);
//		int n6 = money / 100;
//		//money %= 100;
//		System.out.println(n6);
//		int n7 = money / 10;
//		//money %= 10;
//		System.out.println(n7);
//		//int n8 = money;
//		//System.out.println(n8);
		
		System.out.println(money/50000);
		System.out.println(money%50000/10000);
		System.out.println(money%10000/5000);
		System.out.println(money%5000/1000);
		System.out.println(money%1000/500);
		System.out.println(money%500/100);
		System.out.println(money%100/10);
	}
}
