package packageA;
import packageB.*;

class ClassA extends ClassB {
	void method() {
		publicA = 10;
		protectedA = 10; 
		//defaultA = 10; //error! : default는 같은 패키지내에서만 가능하므로 다른 패키지에서 상속 x 
		//privateA = 10; //error! : private으로 선언됨 
	}

}

//class ClassAA extends ClassBB{} //error! : ClassBB의 접근제한자가 'default'임

class ClassAA{ //ClassB를 상속을 받지 않은 상태
	void method() {
		//ClassB가 public으로 선언되어있으므로 생성 가능
		ClassB classB = new ClassB();
		classB.publicA = 10;
		//classB.protectedA = 10; //error! : protected는 상속을 받아야 사용할 수 있음(다른 패키지에서 사용할때)
		//classB.defaultA = 10;
		//classB.privateA = 10;
		
	}
}