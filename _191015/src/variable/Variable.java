package variable;

public class Variable {
	public static void main(String[] args) {
		
		boolean bool = true;
		char ch = 'a';
		byte by = 1;
		short sh = 10;
		int in = 100;
		long lo = 1000;
		float fl = 0.1f; //default ���� double �̹Ƿ� 'f'��� ��ø� ���־�� float�������� �ν���
		//float����� - ���� �߻�
		double dou = 0.01;
		//����
		bool = false;
		//bool = 1; �Ұ���
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
//		int a = 10; //10����
//		int a8 = 012; //8����
//		int a16 = 0xA; //16����
//		System.out.println(a+" "+a8+" "+a16);
//		
//		long b= 11; //10����
//		long b8 = 013; //8����
//		long b16 = 0xB; //16����
//		System.out.println(b+" "+b8+" "+b16);
		
		System.out.println(ch);
		ch = 65; //�ƽ�Ű�ڵ�(127���� ���ǵǾ�����) => 1byte�� ������ �ִ� ���� �� : 127����
		System.out.println(ch);
	}

}
