package Synchronized;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//동기화 방법 1 : 메소드를 동기화 메소드로 만듦
	public synchronized void setMemory(int memory) {
		//동기화 방법 2.
		//synchronized(this){//객체의 setMemory()메소드를 동기화 메소드로 만듦
		this.memory = memory;
		try {
			System.out.println(Thread.currentThread().getName()+": "+ this.memory);
			Thread.sleep(2000); // 스레드를 2초간 일시 정지시킴 => set메모리를 사용할때 딜레이 생성
			//1000:1초
		}catch(InterruptedException e) {System.out.println("Exception");} // "Exception e"라고 해도 됨
		System.out.println(Thread.currentThread().getName()+": "+ this.memory);
		//Thread클래스 안에 있는 currentThread()메소드(=현재 스레드 리턴)실행하고 그 스레드 이름 얻기
		//}
	}

}
