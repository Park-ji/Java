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
		
		//�Ǽ��� ����� ���������� �����ϹǷ� 
		//�Ǽ��� ������ ���������� �ٲ۴����� ������ ���
		//ex, 10.0 => 10���� (*10) ����ϰ� ���߿� 10���� ������ ok
		
		a = 100; // da*10
		b = 61; // db*10
		
		System.out.println(a*b);
		System.out.println(a/b);
		
		System.out.println((a*b)/100);
		System.out.println(a/b); // 100���� �����ʿ� x
		
		
		//!, ~
		boolean bool = true;
		bool =!bool;
		System.out.println(bool);//�� ���� ������
		
		byte v1 = 1; // 0000 0001
		System.out.println(~v1); //��Ʈ ���� ������
		// 1111 1110 -> 0000 0001 -> 0000 0010 : -2
	}
}
