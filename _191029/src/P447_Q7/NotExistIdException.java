package P447_Q7;

public class NotExistIdException extends Exception {
	public NotExistIdException() {
		// TODO Auto-generated constructor stub
		
	}
	
	public NotExistIdException(String message) {
		super(message);
		//System.out.println("아이디가 존재하지 않습니다.");
	}

}
