package mutithread;

//interface������� ��Ƽ������ ����!
public class ThreadTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ν���");
		
		//3) ��Ƽ������� ������ ��ü ���� -> Runnable Ÿ�� ��ü 2�� ������
		TestThread2 t1 = new TestThread2("one");
		TestThread2 t2 = new TestThread2("two");
		
		//4) Runnable ��ü�� Thread�� ��ȯ
		Thread tt1 = new Thread(t1); //t1�� �Ű������� ��
		Thread tt2 = new Thread(t2);
		//5) run�޼ҵ� ȣ���ش޶�� �ϴ� �޼ҵ�(start)
		tt1.start(); //one�� 10�� ���
		tt2.start(); //two�� 10�� ���
		
		System.out.println("��������");
	//��µǴ� ����� �Ź� �ٸ��� ����!
		//������?
		//�ٸ���?
	
		
	}
	

}


//TestThread�� ��Ƽ������� ����
//1) Runnable �������̽� ���
class TestThread2 implements Runnable{
	String msg;
	TestThread2(String msg){
		this.msg = msg;
	}
	//2) run�޼ҵ� �������̵� ==> ��Ƽ������� ���� ���������� ���� �ڵ�
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+":"+msg);
		}
	}
	
	
}
