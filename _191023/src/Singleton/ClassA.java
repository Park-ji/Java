package Singleton;

public class ClassA {
	//ClassB b = new ClassB(); // ���� �б��� ���� �����Ƿ� ����~
	//ClassB���� �����ڸ� private���� �����ؼ� �ȵǿ�~
	
	public static void main(String[] args) {
		ClassB b1 = ClassB.getInstance();
		ClassB b2 = ClassB.getInstance();
		
		//Ŭ����B���� ��ü�� �ϳ��� ��������Ƿ� 
		//b1�� b2�� ���� ��ü��� �Ҽ��ֵ�~
		
		//�ּҰ��� ���� ���ƿ�~
		System.out.println(b1);
		System.out.println(b2);
	}
	
	//ClassB b = ClassB.getInstance();//static�� ����ϸ� ��ü ���� �ʿ���� �ٷ� ��밡���ϴϱ�
	//���⼭ ClassB�ȿ� �޼��带 static���� �����ϸ� ����~

}
