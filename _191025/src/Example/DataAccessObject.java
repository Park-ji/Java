package Example;

public interface DataAccessObject {
	void select();
	void insert();
	void update();
	void delete();
	//default, static을 이용해서 메소드를 정의, 선언하면? 상속받는 곳에서 재정의 하지 않아도 되요~
	default void print() {//일반적인 메소드
		System.out.println("print()");
	}
	static void staticPrint() {//인터페이스에 종속된 메소드
		System.out.println("staticPrint()");
	}

}
