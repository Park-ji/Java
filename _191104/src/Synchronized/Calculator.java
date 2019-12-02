package Synchronized;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//����ȭ ��� 1 : �޼ҵ带 ����ȭ �޼ҵ�� ����
	public synchronized void setMemory(int memory) {
		//����ȭ ��� 2.
		//synchronized(this){//��ü�� setMemory()�޼ҵ带 ����ȭ �޼ҵ�� ����
		this.memory = memory;
		try {
			System.out.println(Thread.currentThread().getName()+": "+ this.memory);
			Thread.sleep(2000); // �����带 2�ʰ� �Ͻ� ������Ŵ => set�޸𸮸� ����Ҷ� ������ ����
			//1000:1��
		}catch(InterruptedException e) {System.out.println("Exception");} // "Exception e"��� �ص� ��
		System.out.println(Thread.currentThread().getName()+": "+ this.memory);
		//ThreadŬ���� �ȿ� �ִ� currentThread()�޼ҵ�(=���� ������ ����)�����ϰ� �� ������ �̸� ���
		//}
	}

}
