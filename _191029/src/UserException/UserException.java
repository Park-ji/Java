package UserException;

public class UserException extends Exception {
	UserException(){
		//input을 아무것도 안받는 생성자
	}
	UserException(String message){
		super(message);
		//부모클래스에 메세지 전달
		//UserException에 에러 정보를 전달
		//ex, printStackTrace()함수에 나타남
	}
	void printError() {
		System.out.println("문제 발생");
	}

}
