package mutithread;

public class ThreadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ν���");
		
		//3) ��Ƽ������� ������ ��ü ���� -> 2�� ������
		TestThread t1 = new TestThread("one");
		TestThread t2 = new TestThread("two");
		
		t1.setPriority(Thread.MIN_PRIORITY); //1
		t2.setPriority(Thread.MAX_PRIORITY); //10
		System.out.println("t1�켱���� ="+t1.getPriority());
		System.out.println("t2�켱���� ="+t2.getPriority());
		
		
		//4) ��Ƽ������ start ȣ��
		//run�޼ҵ� ȣ���ش޶�� �ϴ� �޼ҵ�(start)
		t1.start(); //one�� 10�� ���
		t2.start(); //two�� 10�� ���
		
		System.out.println("��������");
	//��µǴ� ����� �Ź� �ٸ��� ����!
		//������?
		//�ٸ���?
	
		
	}
	

}



//TestThread�� ��Ƽ������� ����
//1) Thread ���
class TestThread extends Thread{
	String msg;
	TestThread(String msg){
		this.msg = msg;
	}
	//2) run�޼ҵ� �������̵� ==> ��Ƽ������� ���� ���������� ���� �ڵ�
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+":"+msg);
		}
	}
	
	
}
