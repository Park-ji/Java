package mutithread;


class SubThread{
	void b() {
		System.out.println("�ٸ�Ŭ������ b�޼ҵ� ����");
	}
}


public class MainThread {
	//mainthread�����? main�޼��� ������ �����~
	
	//main �޼��嵵 �ְ� a��� �޼ҵ�� ����
	//�����ư��? a�޼���� ���� �ȵ�
	//java�� ���? � Ư�� Ŭ������ �����Ѵٴ� ���� Ư�� Ŭ������ �ִ� main�Լ��� �����Ų�ٴ� ��~
	public static void main(String[] args) {
		System.out.println("main�޼ҵ峻��");
		//a�� �����ϰ������?
		//�޼ҵ带 ���Ǹ� �ߴٰ� �ؼ� ����� �����ִ� ���� �ƴ� --> ȣ���� �ؾ���
		//a();//�޼ҵ� ȣ��! -> ����? static�Լ����� non-static�Լ��� �����Ű���� �߱� ������
		MainThread m = new MainThread();
		m.a();
		SubThread s = new SubThread();
		s.b();
	}
	
	void a() {//�޼ҵ� ����
		System.out.println("a�޼ҵ� ����");
	}

}
