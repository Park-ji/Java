package override_example;

public class Test {
	
	@Override
	public String toString() { //������ �ִ� �Լ��� �������̵�
		System.out.println(super.toString());//Object.toString()�� ȣ��~
		return "Test";
	}
	
	
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.toString());
	}

}
