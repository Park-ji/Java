package p418_5;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run(); //�ʵ尪���� ������ ������
		anony.method1(); //�޼��忡�� ������ ������
		anony.method2(new Vehicle() {//�Ű������� ������
			@Override
			public void run() {
				System.out.println("Ʈ���� �޸��ϴ�.");
			}
		}
		);
	}

}
