package Family;

public class Main {
	public static void main(String[] args) {
		Parent parent;
		Child child = new Child();
		//�ڵ� ����ȯ
		parent = new Child();//�θ�ü�� �ڽİ�ü�� �Ҵ�!
		//Ÿ���� parent���� �ȿ� ����ִ°��� Child��ü
		//Child�� ���Ӱ� �ʵ尪�� ���Ӱ� �����ص� Ÿ���� parent�̱⶧����
		//parent�� ���ǵǾ��ִ� ��ŭ�� ���� �� ����
		//��, Child�� field2 �ʵ尪�� method2 �޼ҵ尪�� ���������(Parent���� �����ϱ�~)
		
		//�翬�� ���~
		System.out.println(child.field1); //child���� field1�� �������
		child.method1();
		child.method2();
		
		//�ڵ�����ȯ
		System.out.println(parent.field1);//parent���� field1�� �������
		parent.method1();//Child�� Parent�� ����� �ް� �����Ƿ� method1 ���� ����~
		//method�� child���� �������̵� �Ѱ��� ������ ��
		//parent.method2();//error! : Parent�� ������ �ִ� �ʵ�, �޼ҵ尪���θ� ������ ������~
		
		
		//���� ����ȯ
		//1. Child�� ParentŸ������ �ڵ� ����ȯ �Ǿ�����
		//2. �Ǿ��ִ� ���� �ٽ� ChildŸ������ �ٽ� �ٲܼ� ���� -->��������ȯ
		
		Child child2 = (Child)parent;
		System.out.println(child2.field1);
		child2.method1();
		child2.method2();//�ٽ� ChildŸ������ ����ȯ �����Ƿ� --> method2�� ������ �����ϴ�~
		
	}


}
