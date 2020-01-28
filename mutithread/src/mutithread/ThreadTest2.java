package mutithread;

//interface상속으로 멀티스레드 구현!
public class ThreadTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인시작");
		
		//3) 멀티스레드로 동작할 객체 생성 -> Runnable 타입 객체 2개 생성함
		TestThread2 t1 = new TestThread2("one");
		TestThread2 t2 = new TestThread2("two");
		
		//4) Runnable 객체를 Thread로 변환
		Thread tt1 = new Thread(t1); //t1를 매개변수로 줌
		Thread tt2 = new Thread(t2);
		//5) run메소드 호출해달라고 하는 메소드(start)
		tt1.start(); //one이 10번 출력
		tt2.start(); //two가 10번 출력
		
		System.out.println("메인종료");
	//출력되는 결과가 매번 다를수 있음!
		//같은것?
		//다른것?
	
		
	}
	

}


//TestThread를 멀티스레드로 만듦
//1) Runnable 인터페이스 상속
class TestThread2 implements Runnable{
	String msg;
	TestThread2(String msg){
		this.msg = msg;
	}
	//2) run메소드 오버라이딩 ==> 멀티스레드로 뭐를 동작할지에 관한 코드
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+":"+msg);
		}
	}
	
	
}
