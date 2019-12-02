package UserException;

public class User {
	
	
	
	
	//1. main실행 => 2.run() ==> 3. i가 5가 되는 순간 에러 발생 =만든 클래스 발생&던짐  ==> 4. 던져준 throw를 throws로 던져줌(타입이 같아야함) ==> 5. 던진 에러를 catch로 받음(객체를 받음! ex, e객체) ==> 6. e.printstackTrace --> 에러코드가 나옴
	//7. printStackTrace()함수는 사위클래스인 'class UserException extends Exception'중 Exception에 있던 함수
	
	public static void main(String[] args) {
		//에러를 던졌으면 try-catch로 받아야함
		try {
		run();
		}catch(UserException e) {
			e.printStackTrace();
			//e.printError();
		}

	}
	
	//예외를 수동으로 잡을때
	//throw로 던져해야되고 heap에 객체를 선언해서 던져야 하므로 new 사용하고
	//던진 에러를 run()함수에 throw해주고 
	//그렇게 던져진 에러를 try-catch로 잡음	
	private static void run() throws UserException{
		for(int i=0; i<10;i++) {
			if(i==5) {//에러타이밍을 조건절로 잡는다
				//1.
				//throw new UserException();//exception발생
				//컴퓨터한테 에러가 났다고(userexception이 발생했다고) 던져준다는 의미
				//UserExcepiton은 클래스이므로 객체화를 해서 넘겨줘야 함
				//여기서 발생한 에러는 try-catch로 받던지 thorw를 통해서 던져야함
				//위에 'throws Exception'으로 던져도 되고
				//'throws UserException'으로 던져도 됨
				
				//2.
				throw new UserException("i가 5일때 에러가 발생되었습니다.");
			}
		}
	}

}


//출력된 에러 메세지
//UserException.UserException
//printStackTrace()가 찍어내는 것
//at UserException.User.run(User.java:24)
//at UserException.User.main(User.java:14)


