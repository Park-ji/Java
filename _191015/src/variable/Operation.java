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

		// ������ ����� �����ؾ��մϴ�!
		// �������� �ϴ� ���� 0? error!

		result = a % 3; // ������ ����
		System.out.println(result);

		// ���Կ�����: =,+=,-=,*=,/=....
		a += 10;
		System.out.println(a);
		a /= 10;
		System.out.println(a);
		
		// ���������� : ++, -- --> ++a vs a++
		a++; //a=a+1
		System.out.println(a);
		a--; //a=a-1
		System.out.println(a);
		
		System.out.println(++a);
		System.out.println(--a);
		
		//���׿�����
		int n1 = 10;
		int n2 = 0;
		n2 = (n1==0)?1:2;
		System.out.println("\n"+n2);
		

	}

}
