package Example;

public interface DataAccessObject {
	void select();
	void insert();
	void update();
	void delete();
	//default, static�� �̿��ؼ� �޼ҵ带 ����, �����ϸ�? ��ӹ޴� ������ ������ ���� �ʾƵ� �ǿ�~
	default void print() {//�Ϲ����� �޼ҵ�
		System.out.println("print()");
	}
	static void staticPrint() {//�������̽��� ���ӵ� �޼ҵ�
		System.out.println("staticPrint()");
	}

}
