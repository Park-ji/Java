package packageA;
import packageB.*;

class ClassA extends ClassB {
	void method() {
		publicA = 10;
		protectedA = 10; 
		//defaultA = 10; //error! : default�� ���� ��Ű���������� �����ϹǷ� �ٸ� ��Ű������ ��� x 
		//privateA = 10; //error! : private���� ����� 
	}

}

//class ClassAA extends ClassBB{} //error! : ClassBB�� ���������ڰ� 'default'��

class ClassAA{ //ClassB�� ����� ���� ���� ����
	void method() {
		//ClassB�� public���� ����Ǿ������Ƿ� ���� ����
		ClassB classB = new ClassB();
		classB.publicA = 10;
		//classB.protectedA = 10; //error! : protected�� ����� �޾ƾ� ����� �� ����(�ٸ� ��Ű������ ����Ҷ�)
		//classB.defaultA = 10;
		//classB.privateA = 10;
		
	}
}