package mutithread;

public class ThreadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인시작");
		
		//3) 멀티스레드로 동작할 객체 생성 -> 2개 생성함
		TestThread t1 = new TestThread("one");
		TestThread t2 = new TestThread("two");
		
		t1.setPriority(Thread.MIN_PRIORITY); //1
		t2.setPriority(Thread.MAX_PRIORITY); //10
		System.out.println("t1우선수위 ="+t1.getPriority());
		System.out.println("t2우선수위 ="+t2.getPriority());
		
		
		//4) 멀티스레드 start 호출
		//run메소드 호출해달라고 하는 메소드(start)
		t1.start(); //one이 10번 출력
		t2.start(); //two가 10번 출력
		
		System.out.println("메인종료");
	//출력되는 결과가 매번 다를수 있음!
		//같은것?
		//다른것?
	
		
	}
	

}



//TestThread를 멀티스레드로 만듦
//1) Thread 상속
class TestThread extends Thread{
	String msg;
	TestThread(String msg){
		this.msg = msg;
	}
	//2) run메소드 오버라이딩 ==> 멀티스레드로 뭐를 동작할지에 관한 코드
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+":"+msg);
		}
	}
	
	
}
