package mutithread;


class SubThread{
	void b() {
		System.out.println("다른클래스의 b메소드 내부");
	}
}


public class MainThread {
	//mainthread실행시? main메서드 내용이 실행됨~
	
	//main 메서드도 있고 a라는 메소드는 있음
	//실행버튼시? a메서드는 실행 안됨
	//java의 약속? 어떤 특정 클래스를 실행한다는 것은 특정 클래스에 있는 main함수를 실행시킨다는 말~
	public static void main(String[] args) {
		System.out.println("main메소드내부");
		//a를 실행하고싶으면?
		//메소드를 정의만 했다고 해서 결과를 볼수있는 것은 아님 --> 호출을 해야함
		//a();//메소드 호출! -> 에러? static함수에서 non-static함수를 실행시키려고 했기 때문에
		MainThread m = new MainThread();
		m.a();
		SubThread s = new SubThread();
		s.b();
	}
	
	void a() {//메소드 정의
		System.out.println("a메소드 내부");
	}

}
