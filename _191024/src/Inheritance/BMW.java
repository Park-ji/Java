package Inheritance;

//�θ� ��ü�� ���� �����ǰ� �ڽ� ��ü�� �� ������ �����ȴ�.

public class BMW extends Car {//�ڽ�Ŭ����
	boolean booster = false;
	
	BMW(){
		super("BMW5");
		System.out.println("BMW() ������");
	}
	
	public static void main(String[] args) {
		BMW bmw = new BMW();
		//1. �θ� ��ü�� ���� �����Ǽ� model, curSpeed�� �����
		//2. �ڽ� ��ü�� �����Ǽ� booster�� ���������.
		
		bmw.model = "BMW525";
		System.out.println(bmw.model);
		System.out.println(bmw.curSpeed);
	}
}

